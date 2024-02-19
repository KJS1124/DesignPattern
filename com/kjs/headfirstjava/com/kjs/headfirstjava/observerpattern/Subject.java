package com.kjs.headfirstjava.com.kjs.headfirstjava.observerpattern;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-18
 * Time:16:23
 */
public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
}
