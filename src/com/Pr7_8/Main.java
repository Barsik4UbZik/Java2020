package com.Pr7_8;

import com.Pr7_8.Positions.Manager;
import com.Pr7_8.Positions.TopManager;
import com.Pr7_8.Positions.Operator;

public class Main
{
    public static void main(String[] args)
    {
        Company company = new Company();
        Employee emp = new Employee("Last", "Name", 150, null);
        Employee emp2 = new Employee("Last2", "Name2", 1500, null);

        System.out.println(company);
        company.hire(emp, new Manager(1000));
        company.hire(emp2, new TopManager(company));
        System.out.println(company);
        company.fire(emp);
        System.out.println(company);
    }
}
