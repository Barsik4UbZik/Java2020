package com.Pr2;

public class Ball
{
    private String name;
    private int size;
    public Ball(String n, int a)
    {
        name = n;
        size = a;
    }
    public Ball(String n)
    {
        name = n;
        size = 0;
    }
    public Ball()
    {
        name = "Football";
        size = 0;
    }
    public void setSize(String size)
    {
        this.size = size;
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
        return size;
    }
    @Override
    public String toString()
    {
        return this.name+",size"+this.size;
    }
}
