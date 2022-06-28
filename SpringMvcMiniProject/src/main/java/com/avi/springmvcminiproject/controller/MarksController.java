package com.avi.springmvcminiproject.controller;

import com.avi.springmvcminiproject.entity.Marks;
import com.avi.springmvcminiproject.pojo.MarksPOJO;
import com.avi.springmvcminiproject.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/marks")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("marksAdd") MarksPOJO marksPOJO, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "MarksAdd";
        }
        marksService.save(marksPOJO);
        return "redirect:/marks/list";
    }
    @RequestMapping("/add")
    public String add(Model theModel){
        MarksPOJO marksPOJO=new MarksPOJO();
        theModel.addAttribute("marksAdd",marksPOJO);
        return "MarksAdd";
    }
    @RequestMapping("/list")
    public String list(Model theModel){
        List<Marks> marks=marksService.findAll();
        theModel.addAttribute("marksList",marks);
        return "MarksList";
    }
    @RequestMapping("/update/{id}")
    public String update(Model theModel,@PathVariable("id") int id){
        Optional<Marks> marks=marksService.findById(id);
        if(marks.isPresent()) {
            theModel.addAttribute("marksUpdate", marks.get());
        }
        return "MarksEditForm";
    }

}
