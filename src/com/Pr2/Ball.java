package com.Pr2;

public class Ball
{
    private String name;
    private int size;
    public Ball(String name, int size)
    {
        this.name = name;
        this.size = size;
    }
    public void setSize(int size)
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
        return "Ball{" + "name='" + name + '\'' + ", size=" + size + '}';
    }
}
