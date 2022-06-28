package net.codejava;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@Autowired
	private ProductService service; 
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Product> listProducts = service.listAll();
		model.addAttribute("listProducts", listProducts);
		
		return "index";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		
		return "new_product";
	}
	
	@PostMapping("/product/save")
	public String saveProduct(Product product, HttpServletRequest request) {
		String[] detailIDs = request.getParameterValues("detailID");
		String[] detailNames = request.getParameterValues("detailName");
		String[] detailValues = request.getParameterValues("detailValue");
		
		for(int i=0; i<detailNames.length; i++)
		{
			if(detailIDs !=null && detailIDs.length>0)
			{
				product.setDetails(Integer.valueOf(detailIDs[i]),detailNames[i], detailValues[i]);
			}
			else {
			product.addDetails(detailNames[i], detailValues[i]);
			}
		}
		service.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/product/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = service.get(id);
		mav.addObject("product", product);
		
		return mav;
	}
	
	@RequestMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";		
	}
}
