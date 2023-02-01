package com.nidhal.WorkFlow.controller;

import com.nidhal.WorkFlow.entity.Employee;
import com.nidhal.WorkFlow.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;
    private static final int PAGE_SIZE = 12;

    @GetMapping("/employees")
    public String getAllEmployees(Model model, @RequestParam(defaultValue = "1") int page) {
        List<Employee> employeeList = employeeService.findAll();
        int totalPages = (int) Math.ceil((float) employeeList.size() / PAGE_SIZE);
        long totalItems = employeeList.size();
        model.addAttribute("totalItems", totalItems);
        model.addAttribute("employeeList", employeeList.subList((page - 1) * PAGE_SIZE, Math.min(page * PAGE_SIZE, employeeList.size())));
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "table";
    }


    @GetMapping("/employee/edit/{id}")
    public String getEmployeeById(@PathVariable long id, Model model) {
        Employee employee = employeeService.findById(id);
        model.addAttribute("employee", employee);
        return "index";
    }

    @GetMapping("/employee/delete/{id}")
    public String deletePatients(@PathVariable Long id) {
        employeeService.deleteById(id);
        return "redirect:/employees";
    }

}

