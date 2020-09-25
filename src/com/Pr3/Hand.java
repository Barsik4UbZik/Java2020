package com.Pr3;

public class Hand
{
    private int fingers;
    private int length;
    public Hand(int fingers, int length)
    {
        this.fingers = fingers;
        this.length = length;
    }
    public void setFingers(int fingers)
    {
        this.fingers = fingers;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public int getFingers()
    {
        return fingers;
    }
    public int getLength()
    {
        return length;
    }
    @Override
    public String toString()
    {
        return "Hand{" + "fingers=" + fingers + ", length=" + length + '}';
    }
}
