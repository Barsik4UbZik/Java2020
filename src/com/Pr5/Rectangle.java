package com.Pr5;

public class Rectangle extends Shape
{
    private int width;
    private int length;
    public Rectangle (int width, int length, String color)
    {
        super(color);
        this.width = width;
        this.length = length;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getWidth()
    {
        return width;
    }
    public int getLength()
    {
        return length;
    }
    @Override
    double getArea()
    {
        return width * length;
    }
    @Override
    public String toString()
    {
        return "Rectangle{" + "width='" + width + '\'' + ", length='" + length + '}';
    }
}
