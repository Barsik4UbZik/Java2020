package com.Pr6;
import com.Pr5.Circle;

public class MovableCircle extends Circle implements Movable
{
    private MovablePoint center;
    public MovableCircle(double radius, String color, MovablePoint center)
    {
        super(radius, color);
        this.center = center;
    }
    public void setCenter(MovablePoint center)
    {
        this.center = center;
    }
    public MovablePoint getCenter()
    {
        return center;
    }
    @Override
    public void move(int right, int down)
    {
        center.move(right, down);
    }
}
