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
    public double calcSalary(double fullIncome, double baseIncome)
    {
        return baseIncome + incomeToCompany * 0.05;
    }

    //@Override
    public double getIncomeToCompany()
    {
        return 0;
    }
}