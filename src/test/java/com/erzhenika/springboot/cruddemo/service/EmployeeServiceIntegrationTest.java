package com.erzhenika.springboot.cruddemo.service;

import com.erzhenika.springboot.cruddemo.CruddemoApplication;
import com.erzhenika.springboot.cruddemo.dao.EmployeeDAO;
import com.erzhenika.springboot.cruddemo.entity.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = CruddemoApplication.class)
public class EmployeeServiceIntegrationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @MockitoBean
    EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeService employeeService;

    private Employee employee;

    @BeforeEach
    void beforeEachSetUp() {
        employee = new Employee("Ivan", "Ahaha", "ivan@ahaha.com");
    }

    @Test
    @DisplayName("assert findAll() method")
    public void assertFindAll() {
        when(employeeDAO.findAll())
                .thenReturn(new ArrayList<>(List.of(employee)));

        assertEquals(employee, employeeService.findAll().getFirst());

        verify(employeeDAO).findAll();
        verify(employeeDAO, times(1)).findAll();
    }
}