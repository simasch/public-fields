package com.example.pubfields;

import com.example.pubfields.entity.Employee;
import com.example.pubfields.entity.Phone;
import com.example.pubfields.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataPopulator implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public DataPopulator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    @Override
    public void run(String... args) {
        var employee = new Employee();
        employee.name = "Peter Muster";

        var phone = new Phone();
        phone.number = "032 544 88 88";
        phone.employee = employee;

        employee.phones.add(phone);

        employeeRepository.saveAndFlush(employee);
    }
}
