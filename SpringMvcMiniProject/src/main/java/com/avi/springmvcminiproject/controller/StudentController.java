package com.avi.springmvcminiproject.controller;

import com.avi.springmvcminiproject.entity.Assets;
import com.avi.springmvcminiproject.entity.Student;
import com.avi.springmvcminiproject.service.AssetsService;
import com.avi.springmvcminiproject.service.StudentService;
import com.avi.springmvcminiproject.pojo.StudentPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private AssetsService assetsService;

    private String listProducts= "listProducts";
    @GetMapping("/list")
    public String list(Model theModel){
            List<Student> students= studentService.findAll();
            theModel.addAttribute("studentList",students);
            return "StudentList";
    }
    @RequestMapping("/add")
    public String add(Model theModel){
        StudentPOJO studentPOJO=new StudentPOJO();
        theModel.addAttribute("studentAdd",studentPOJO);
        List<Assets> assets=assetsService.findAll();
        theModel.addAttribute(listProducts,assets);
        return "StudentForm";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("studentAdd") StudentPOJO studentPOJO, BindingResult result,Model theModel){
        if(result.hasErrors()){
            List<Assets> assets=assetsService.findAll();
            theModel.addAttribute(listProducts,assets);
             return "StudentForm";
        }
        studentService.save(studentPOJO);
        return "redirect:/student/list";
    }

    @RequestMapping("/update/{id}")
    public String update(Model theModel,@PathVariable("id") int id){
        Optional<Student> student=studentService.findById(id);
        if(student.isPresent()) {
            theModel.addAttribute("studentUpdate", student.get());
        }
        return "EditForm";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
            studentService.deleteById(id);
            return "redirect:/student/list";
    }
    @RequestMapping("/temp/{name}")
    public String temp(@PathVariable("name") String name){
        System.out.println(studentService.getStudentByName(name));
        return "redirect:/student/list";
    }

}
