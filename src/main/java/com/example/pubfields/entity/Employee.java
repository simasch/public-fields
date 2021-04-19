package com.example.pubfields.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    public Integer id;
    public String name;

    @OneToMany(mappedBy = "employee", cascade = ALL, orphanRemoval = true)
    public Set<Phone> phones = new HashSet<>();
}
