package com.Pr7_8;

public class Employee
{
    private String name;
    private String surname;
    private double baseSalary;
    private EmployeePositions positions;
    public  Employee(String name, String surname, double baseSalary, EmployeePositions positions)
    {
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
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

    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary()
    {
        return baseSalary;
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
        return "Employee{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", baseSalary=" + baseSalary + ", positions=" + positions + '}';
    }
}