package com.example.employee_management.repository;

import com.example.employee_management.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(Double salary);

    boolean existsByEmail(String email);
}
