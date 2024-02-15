package com.kjs.headfirstjava.thirdsolution;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-14
 * Time:21:58
 */
public class ThirdSolution {
    public static void main(String[] args) {
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


interface FlyableBehaviour {
    void fly();
}

class Fly implements FlyableBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

class NoFly implements FlyableBehaviour {
    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}

class Duck {
    FlyableBehaviour flyableBehaviour;
    Duck(FlyableBehaviour flyableBehaviour) {
        this.flyableBehaviour = flyableBehaviour;
    }
    void display() {
        System.out.println("Display duck");
    }

    void swim() {
        System.out.println("Swim Duck");
    }
    
    void fly() {
        this.flyableBehaviour.fly();
    }
}

class MallardDuck extends Duck{
    MallardDuck() {
        super(new Fly());
    }
}

class RedHeadDuck extends Duck {

    RedHeadDuck() {
        super(new Fly());
    }
}

class RubberDuck extends Duck {
    RubberDuck() {
        super(new NoFly());
    }
}
