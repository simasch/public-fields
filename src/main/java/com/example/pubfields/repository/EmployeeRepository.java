package com.example.pubfields.repository;

import com.example.pubfields.entity.Employee;
import com.example.pubfields.entity.PhoneDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select new com.example.pubfields.entity.PhoneDTO(p.number, p.employee.name) from Phone p")
    List<PhoneDTO> listPhones();
}
