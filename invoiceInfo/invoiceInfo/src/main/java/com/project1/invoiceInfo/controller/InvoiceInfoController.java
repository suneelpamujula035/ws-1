package com.project1.invoiceInfo.controller;

import com.project1.invoiceInfo.entity.InvoiceInfo;
import com.project1.invoiceInfo.service.InvoiceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class InvoiceInfoController {
    @Autowired
    private InvoiceInfoService invoiceInfoService;



    @GetMapping("/openNewInvoiceInfoForm")
    public String openNewInvoiceInfoForm(Model model) {
        InvoiceInfo invoiceInfo = new InvoiceInfo();
        model.addAttribute("invoiceInfo", invoiceInfo);
        return "new_invoiceInfo";
    }


    @PostMapping("/saveInvoice")
    public String saveInvoiceInfo(@ModelAttribute("invoiceInfo") InvoiceInfo invoiceInfo) {
      
        invoiceInfoService.saveInvoiceInfo(invoiceInfo);
        return "redirect:/all";
    }

    @GetMapping("/editInvoiceForm/{id}")
    public String editInvoiceForm(@PathVariable(value = "id") long id , Model model) {
        InvoiceInfo invoiceInfo= invoiceInfoService.getInvoiceById(id);
        model.addAttribute("invoiceInfo",invoiceInfo);
        return "update_invoiceInfo";
    }
    @GetMapping("/deleteInvoiceByid/{id}")
    public String deleteInvoiceByid(@PathVariable(value = "id") long id){
            this.invoiceInfoService.deleteInvoiceById(id);
            return "redirect:/all";
    }
    

    @RequestMapping(value = {"/all/{type}","/all"}, method = RequestMethod.GET)
    public ModelAndView all( @PathVariable Map<String, String> pathVariablesMap, HttpServletRequest req) {
        
        PagedListHolder<InvoiceInfo> list = null;
        
        String type = pathVariablesMap.get("type");
        
        if(null == type) {
            
            List<InvoiceInfo> invoiceList = invoiceInfoService.getAllInvoiceInfo();
            
            list = new PagedListHolder<InvoiceInfo>();
            list.setSource(invoiceList);
            list.setPageSize(2);
            
            req.getSession().setAttribute("invoiceList",  list);
        
//            printPageDetails(list);
            
        } else if("next".equals(type)) {
            
        	list = (PagedListHolder<InvoiceInfo>) req.getSession().getAttribute("invoiceList");
            
        	list.nextPage();
            
//            printPageDetails(list);
            
        } else if("prev".equals(type)) {
            
        	list = (PagedListHolder<InvoiceInfo>) req.getSession().getAttribute("invoiceList");
            
        	list.previousPage();
            
//            printPageDetails(list);
            
        } else {
            
            System.out.println("type:" + type);
            
            list = (PagedListHolder<InvoiceInfo>) req.getSession().getAttribute("invoiceList");
            
            int pageNum = Integer.parseInt(type);
            
            list.setPage(pageNum);
            
//            printPageDetails(list);
        }
                    
        ModelAndView mv = new ModelAndView("Home");
        
        return  mv;
    }

//	private void printPageDetails(PagedListHolder list) {
//
//		System.out.println("curent page - list.getPage() :" + list.getPage());
//
//		System.out.println("Total Num of pages - list.getPageCount :" + list.getPageCount());
//
//		System.out.println("is First page - list.isFirstPage :" + list.isFirstPage());
//
//		System.out.println("is Last page - list.isLastPage :" + list.isLastPage());
//	}
  
}
