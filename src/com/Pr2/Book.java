package com.Pr2;

public class Book
{
    private String name;
    private int year;
    public Book(String name, int year)
    {
        this.name = name;
        this.year = year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getSize()
    {
        return year;
    }
    @Override
    public String toString()
    {
        return "Book{" + "name='" + name + '\'' + ", year=" + year + '}';
    }
}
