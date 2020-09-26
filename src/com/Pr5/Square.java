package com.Pr5;

public class Square extends Shape
{
    private int length;
    public Square(int length, String color)
    {
        super(color);
        this.length = length;
    }
    public void setSize(int length)
    {
        this.length = length;
    }
    public int getLength()
    {
        return length;
    }
    @Override
    double getArea()
    {
        return length * length;
    }
    @Override
    public String toString()
    {
        return "Square{" + "length='" + length + '}';
    }
}
