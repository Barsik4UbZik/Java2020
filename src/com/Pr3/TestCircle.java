package com.Pr3;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle Circle = new Circle(10);
        double radius = Circle.getRadius();
        Circle.setRadius(20);
        System.out.println(radius);
        System.out.println(Circle.getRadius());
        System.out.println(Circle);
    }
}
