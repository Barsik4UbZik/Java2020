package com.Pr2;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Ball Ball = new Ball("Lox", 12);
        String name = Ball.getName();
        System.out.println(name);
        Ball.setName("Loshok");
        System.out.println(Ball.getName());
        System.out.println(Ball);
        TestDog(args);
    }
    public static void TestDog(String[] args)
    {
        TestDog dogs = new TestDog();
        Dog dog = new Dog ("Barboss", 7);
        dogs.addDog(dog);
        System.out.println(Arrays.toString(dogs.list()));
    }
}
