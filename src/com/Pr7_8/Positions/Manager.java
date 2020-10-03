package com.Pr7_8.Positions;

import com.Pr7_8.EmployeePositions;

import java.util.Random;

public class Manager implements EmployeePositions
{
    Random random = new Random();
    private double incomeToCompany = random.nextInt(15000) + 115000;
    public Manager(double incomeToCompany)
    {
        this.incomeToCompany = incomeToCompany;
    }

    @Override
    public String getJobTitle()
    {
        return "Manager";
    }

    @Override
    public double calcSalary(double baseSalary)
    {
        return baseSalary + incomeToCompany * 0.05;
    }

    public void setIncomeToCompany(double incomeToCompany)
    {
        this.incomeToCompany = incomeToCompany;
    }

    public double getIncomeToCompany()
    {
        return incomeToCompany;
    }
}