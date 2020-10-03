package com.Pr7_8;

public class Employee
{
    private String name;
    private String surname;
    private double baseIncome;
    private EmployeePositions positions;
    public  Employee(String name, String surname, double baseIncome, EmployeePositions positions)
    {
        this.name = name;
        this.surname = surname;
        this.baseIncome = baseIncome;
        this.positions = positions;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setBaseIncome(double baseIncome)
    {
        this.baseIncome = baseIncome;
    }

    public double getBaseIncome()
    {
        return baseIncome;
    }

    public void setPositions(EmployeePositions positions)
    {
        this.positions = positions;
    }

    public EmployeePositions getPositions()
    {
        return positions;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", baseIncome=" + baseIncome + ", positions=" + positions + '}';
    }
}