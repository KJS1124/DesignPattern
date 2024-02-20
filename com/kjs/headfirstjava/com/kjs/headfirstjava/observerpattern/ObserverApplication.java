package com.kjs.headfirstjava.com.kjs.headfirstjava.observerpattern;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-18
 * Time:16:36
 */
public class ObserverApplication {
    public static void main(String[] args) {
        MatchStation subject = new MatchStation(0, 0, 0);
        Observer normalScreen = new NormalScreen(subject);
        Observer iphoneScreen = new IphoneScreen(subject);
        Observer tvScreen = new TVScreen(subject);

        subject.change(10,2,0);
        subject.change(20,6,0);
        subject.change(30,21,0);
        subject.change(40,25,1);
        subject.change(50,28,0);
        subject.change(60,29,3);
        subject.change(70,32,0);

    }
}
