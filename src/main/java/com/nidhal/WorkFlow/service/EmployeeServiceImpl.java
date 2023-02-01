package com.nidhal.WorkFlow.service;

import com.nidhal.WorkFlow.entity.Employee;
import com.nidhal.WorkFlow.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(long id) {
        return employeeRepository.findById(id).orElseThrow(
                ()-> new NoSuchElementException("OOPS THERE IS NO EMPLOYEE ID LIKE THIS ONE: " + id)
        );
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(long id) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if(existingEmployee == null)
            throw new NoSuchElementException("CANNOT DELETE A NON-EXISTENT EMPLOYEE WITH THIS ID: " + id );
        else
            employeeRepository.deleteById(id);
    }
}

