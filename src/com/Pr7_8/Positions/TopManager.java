package com.Pr7_8.Positions;

import com.Pr7_8.Company;
import com.Pr7_8.EmployeePositions;

public class TopManager implements EmployeePositions
{
    private Company company;
    public TopManager(Company company)
    {
        this.company = company;
    }

    @Override
    public String getJobTitle()
    {
        return "Top manager";
    }

    @Override
    public  double calcSalary(double baseSalary)
    {
        if (company.getIncome() > 10000000)
        {
            return baseSalary + baseSalary *1.5;
        }
        else
        {
            return  baseSalary;
        }
    }

    public double getIncomeToCompany()
    {
        return 0;
    }
}
