package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/showEmployeeList")
    public String showListOfEmployees(Model model)
    {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showAddEmployeePage")
    public String showAddSEmployee(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "add-employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(Employee employee)
    {
        if(employee.getId()==0)
        {
            employeeService.saveEmployee(employee);
        }
        else
        {
            employeeService.updateEmployee(employee);
        }
        return "redirect:/showEmployeeList";
    }

    @GetMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable long id, Model model)
    {
        model.addAttribute("employee", employeeService.getEmployee(id));
        return "add-employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable long id)
    {
        Employee employee = employeeService.getEmployee(id);
        employeeService.deleteEmployee(employee);
        return "redirect:/showEmployeeList";
    }
}
