package com.Pr6;

import com.Pr5.Rectangle;

public class MovableRectangle extends Rectangle implements Movable
{
    private MovablePoint center;
    public MovableRectangle(int width, int length, String color)
    {
        super(width, length, color);
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
