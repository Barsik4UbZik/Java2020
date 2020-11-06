package com.Pr9;

import com.Pr7_8.EmployeePositions;

import java.util.ArrayList;

public class Company
{
    ArrayList<Employee> employees;
    public Company()
    {
        employees = new ArrayList<Employee>();
    }

    public void hire(Employee employee)
    {
        employees.add(employee);
    }

    public void fire(com.Pr7_8.Employee employee)
    {
        this.employees.remove(employee);
    }
}
