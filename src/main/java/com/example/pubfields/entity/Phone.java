package com.example.pubfields.entity;

import com.example.pubfields.entity.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Phone {

    @Id
    @GeneratedValue
    public Integer id;
    public String number;

    @ManyToOne
    public Employee employee;

}
