package com.nidhal.WorkFlow.service;

import com.nidhal.WorkFlow.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(long id);
    Employee save(Employee employee);
    void deleteById(long id);
}
