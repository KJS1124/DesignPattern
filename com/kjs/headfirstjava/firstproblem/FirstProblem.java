package com.kjs.headfirstjava.firstproblem;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-13
 * Time:13:43
 *
 * Requirements: As per this problem we want to make our duck to fly
 * Steps took: we have added method in super class for the fly duck
 * Problem: As there could be duck that can;t fly such as Rubber Duck by this implementation
 * fly behaviour will be applied to them as well
 * Expected Solution: override the method for rubber duck.
 * Problem with Expected Solution:
 * 1. It will be harder to add new behaviour to many classes as always need to make sure correct behavior is overridden
 * 2. Hard to maintain
 * 3. New type of duck might not need to quack like wooden
 * Solution to this Problem is discussed in SecondProblem
 */
public class FirstProblem {

    public static void main(String args[]) {
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        mallardDuck.display();
        mallardDuck.fly();
        redHeadDuck.display();
        redHeadDuck.fly();
        rubberDuck.display();
        rubberDuck.fly();
    }
}

class Duck {
    void swim() {
        System.out.println("Swim the duck");
    };
    void display() {
        System.out.println("display the duck");
    };
    void fly() {
        System.out.println("fly the duck");
    };
    void quack() {
        System.out.println("quack the duck");
    };
}

class MallardDuck extends Duck {
    void display() {
        System.out.println("Display MallardDuck");
    }
}

class RedHeadDuck extends Duck {
    void display() {
        System.out.println("Display RedHeadDuck");
    }
}

class RubberDuck extends Duck {
    void display() {
        System.out.println("Display RubberDuck");
    }
}
