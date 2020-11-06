package com.Pr9;

import java.time.LocalDate;

public class Employee
{
    private String name;
    private String surname;
    private LocalDate birth;
    private String residence;
    private int phone;
    private int salary;

    public Employee(String name, String surname, LocalDate birth, String residence, int phone, int salary)
    {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.residence = residence;
        this.phone = phone;
        this.salary = salary;
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

    public void setBirth(LocalDate birth)
    {
        this.birth = birth;
    }

    public LocalDate getBirth()
    {
        return birth;
    }

    public void setResidence(String residence)
    {
        this.residence = residence;
    }

    public String getResidence()
    {
        return residence;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }
}
