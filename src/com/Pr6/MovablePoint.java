package com.Pr6;

public class MovablePoint implements Movable
{
    private int x;
    private int y;
    public MovablePoint (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    @Override
    public void move(int right, int down)
    {
        x += right;
        y += down;
    }
}
