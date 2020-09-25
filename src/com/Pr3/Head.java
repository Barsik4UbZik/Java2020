package com.Pr3;

public class Head
{
    private int radius;
    private String color;
    public Head(int radius,String color )
    {
        this.color = color;
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public String getColor()
    {
        return color;
    }
    public int getRadius()
    {
        return radius;
    }
    @Override
    public String toString()
    {
        return "Head{" + "radius=" + radius + ", color='" + color + '\'' + '}';
    }
}
