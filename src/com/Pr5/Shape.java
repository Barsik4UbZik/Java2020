package com.Pr5;

public abstract class Shape
{
    private String color;
    public Shape(String color)
    {
        this.color = color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    abstract double getArea();
    @Override
    public String toString()
    {
        return "Shape{" + "color='" + color + '}';
    }
}
