package com.example.controller;

import com.example.dto.StudentDto;
import com.example.entity.Student;
import com.example.mapper.StudentMapper;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/showListOfStudents")
    public String showListOfStudents(Model model)
    {
        List<StudentDto> l = new ArrayList<>();
        List<Student> studentList = studentService.getAllStudents();
        if(studentList.size()!=0)
        {
            for(Student s : studentList)
            {
                StudentDto studentDto = studentMapper.entityToDto(s);
                l.add(studentDto);
            }
        }
        model.addAttribute("students", l);
        return "index";
    }

    @GetMapping("/showAddStudentPage")
    public String showAddStudent(Model model)
    {
        model.addAttribute("student", new StudentDto());
        List<String> professions = Arrays.asList("Developer", "Tester", "Admin", "Designer");
        model.addAttribute("professionsList",professions);
        List<String> hobbies = Arrays.asList("Reading books", "Movies", "Swimming", "Riding Bikes","Music");
        model.addAttribute("hobbiesList",hobbies);
        return "add-student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@Valid @ModelAttribute("student") StudentDto studentDto, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "add-student";
        }
        Student student = studentMapper.dtoToEntity(studentDto);
        System.out.println("Inside save method");
        if(student.getId()==0)
        {
//            String str = null;
//            System.out.println(str.length());
//            String[] hobbies = student.getHobbies();
//            Stream.of(hobbies).forEach(System.out::println);
            studentService.saveStudent(student);
        }
        else
        {
            studentService.updateStudent(student);
        }

        return "redirect:/showListOfStudents";
    }

    @GetMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable long id, Model model)
    {
        Student student = studentService.getStudent(id);
        StudentDto studentDto = studentMapper.entityToDto(student);
        model.addAttribute("student", studentDto);
        return "add-student";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable long id)
    {
        Student student = studentService.getStudent(id);
        studentService.deleteStudent(student);
        //studentService.deleteStudent(id);
        return "redirect:/showListOfStudents";
    }

}
