package com.Pr7_8.Positions;

import com.Pr7_8.EmployeePositions;

public class Operator implements EmployeePositions
{
    @Override
    public String getJobTitle()
    {
        return "Operator";
    }

    @Override
    public double calcSalary(double baseSalary)
    {
        return baseSalary;
    }

    @Override
    public double getIncomeToCompany()
    {
        return 0;
    }
}
