package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Employee;
import com.example.exception.EmployeeNotFoundException;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public String save(Employee employee) {
        Employee emp = employeeRepo.save(employee);
        return "Employee added successfully with id :" + emp.getId();
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> listOfEmployees = employeeRepo.findAll();
        return listOfEmployees;
    }

    @Override
    public Employee getById(int id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee Not found with id : " + id));
        return employee;
    }

    @Override
    public String update(Employee employee, int id) {
        Employee existingEmployee = employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee Not found with id : " + id));
        existingEmployee.setName(employee.getName());
        existingEmployee.setDesignation(employee.getDesignation());
        existingEmployee.setAddresses(employee.getAddresses());
        employeeRepo.save(existingEmployee);
        return "Employee updated successfully with id :" + id;
    }

    @Override
    public String delete(int id) {
        Employee employee = employeeRepo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee Not found with id : " + id));
        employeeRepo.deleteById(id);
        return "Employee deleted successfully with id :" + id;
    }

}
