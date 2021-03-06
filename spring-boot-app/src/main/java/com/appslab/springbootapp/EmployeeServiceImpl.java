package com.appslab.springbootapp;

import com.appslab.springbootapp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private int number;

    public double totalSalary(List<Employee> employeeList)
    {
        //System.out.println(employeeList.stream().mapToDouble(Employee::getSalary));
        return employeeList.stream().mapToDouble(Employee::getSalary).sum();
    }
    public int totalBonus(List<Employee> employeeList)
    {
        //System.out.println(employeeList.stream().mapToInt(Employee::getBonus));
        return employeeList.stream().mapToInt(Employee::getBonus).sum();
    }

    public void writeNumber(){
        number = number + 1;
        System.out.println(number);
    }


    public double totalDistance(double height, double length, double total) {
        return (total/height)*(length + height);
    }

}