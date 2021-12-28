package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import com.appslab.springbootapp.model.Programmer;
import com.appslab.springbootapp.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo {
    private EmployeeServiceImpl employeeServiceImpl;
    private EmployeeService employeeService;

    public DependencyInjectionDemo(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
        employeeServiceImpl.writeNumber();
    }

    List<Employee> employeeList = Arrays.asList(new Programmer(2100, 400), new Teacher(1600, 200));


}