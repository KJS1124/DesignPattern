package com.kjs.headfirstjava.secondproblem;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-14
 * Time:15:31
 *
 * Requirements: As per previous problem we saw making override method in all classes have problems.
 * So we need to solve the problem for empty override methods
 *
 * Steps took: we have fetch out behaviours to different interface.
 * Implements those interfaces only to the base classes which needs them.
 *
 * Problem:
 * 1. As we have override implementation everywhere whenever we need to update fly method we need to make changes everywhere in call implementations.
 * 2. Now we can't make use of base class to carry the object as it doesn't contain the methods.
 *
 * Solution: Composition
 */
public class SecondProblem {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        mallardDuck.display();
        mallardDuck.fly();
        redHeadDuck.display();
        redHeadDuck.fly();
        rubberDuck.display();
    }
}

class Duck {
    void display() {
        System.out.println("Display duck");
    }

    void swim() {
        System.out.println("Swim Duck");
    }
}

interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("Mallard Duck flys");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck quacks");
    }
}

class RedHeadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("Mallard Duck flys");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Duck quacks");
    }
}

class RubberDuck extends Duck {

}
