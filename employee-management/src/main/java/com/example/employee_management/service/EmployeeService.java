package com.example.employee_management.service;

import com.example.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee updateEmployee(Integer id, Employee employee);

    void deleteEmployee(Integer id);

    List<Employee> getEmployeesByDepartment(String department);

    List<Employee> getEmployeesBySalary(Double salary);
}
