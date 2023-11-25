package com.SpringProjects.EmployeeCRUD.service;

import com.SpringProjects.EmployeeCRUD.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(Long id);
}
