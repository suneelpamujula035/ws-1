package com.example.service;

import com.example.entity.Employee;

import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(long id);
    void updateEmployee(Employee employee);
    void deleteEmployee(long id);
    void deleteEmployee(Employee employee);
}
