package com.erzhenika.springboot.cruddemo.dao;

import com.erzhenika.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
