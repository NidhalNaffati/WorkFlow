package com.nidhal.WorkFlow.repository;

import com.nidhal.WorkFlow.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
