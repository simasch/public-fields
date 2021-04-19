package com.example.pubfields.controller;

import com.example.pubfields.repository.EmployeeRepository;
import com.example.pubfields.entity.PhoneDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<PhoneDTO> listPhones() {
        return employeeRepository.listPhones();
    }

}
