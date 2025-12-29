package com.erzhenika.springboot.cruddemo.service;

import com.erzhenika.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
