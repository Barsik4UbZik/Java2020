package com.Pr3;

public class HumanTest
{
    public static void main(String[] args)
    {
        Head head = new Head(20, "white");
        Leg leg = new Leg(37.6, 57);
        Hand hand = new Hand(5, 60);
        Human human = new Human(head, leg, hand);
        String info = human.toString();
        System.out.println(info);
    }
}
