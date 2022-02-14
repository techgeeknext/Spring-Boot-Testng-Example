package com.techgeeknext.controllers;

import com.techgeeknext.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	/**
     * Get the employee by id
     *
     */
    @GetMapping("/employee")
    public Employee getEmployee() {
            return Employee.builder()
                    .id(1)
                    .name("TechGeekNextUser")
                    .role("Admin")
                    .build();
    }

}
