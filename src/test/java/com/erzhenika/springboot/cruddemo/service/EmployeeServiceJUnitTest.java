package com.erzhenika.springboot.cruddemo.service;

import com.erzhenika.springboot.cruddemo.dao.EmployeeDAO;
import com.erzhenika.springboot.cruddemo.entity.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceJUnitTest {

    @Mock
    EmployeeDAO employeeDAO;

    @InjectMocks
    private EmployeeServiceImpl employeeServiceImpl;

    @Test
    @DisplayName("assert findAll() method")
    public void assertFindAll() {
        Employee employee = new Employee("Ivan", "Ahaha", "ivan@ahaha.com");

        when(employeeDAO.findAll())
                .thenReturn(new ArrayList<>(List.of(employee)));

        assertEquals(employee, employeeServiceImpl.findAll().getFirst());

        verify(employeeDAO).findAll();
        verify(employeeDAO, times(1)).findAll();
    }
}
