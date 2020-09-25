package com.Pr3;

public class Leg
{
    private double leg_size;
    private int length;
    public Leg(double leg_size, int length)
    {
        this.leg_size = leg_size;
        this.length = length;
    }
    public void setLeg_size(double leg_size)
    {
        this.leg_size = leg_size;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public double getLeg_size()
    {
        return leg_size;
    }
    public int getLength()
    {
        return length;
    }
    @Override
    public String toString()
    {
        return "Leg{" + "leg_size=" + leg_size + ", length=" + length + '}';
    }
}
