package com.Pr2;

public class TestDog
{
    private Dog[] dogs = new Dog[5];
    private int i = 0;
    public void addDog(Dog d)
    {
        if (i < 5)
        {
            dogs[i] = d;
            i++;
        }
        else
        {
            System.out.println("Nursery is full");
        }
    }
    public Dog[] list()
    {
        return dogs;
    }
}
