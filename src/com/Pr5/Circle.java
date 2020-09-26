package com.Pr5;

public class Circle extends Shape
{
    private double p = 3.14;
    private double radius;
    public Circle(double radius, String color)
    {
        super(color);
        this.radius = radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    @Override
    double getArea()
    {
        return 2 * radius * p;
    }
    @Override
    public String toString()
    {
        return "Circle{" + "radius='" + radius + '}';
    }
}
