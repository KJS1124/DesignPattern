package com.kjs.headfirstjava.com.kjs.headfirstjava.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-18
 * Time:16:33
 */
public class MatchStation implements Subject {
    private List<Observer> observerList;
    private Integer matchScore;
    private Integer bowls;
    private Integer out;

    public MatchStation(Integer matchScore, Integer bowls, Integer out) {
        this.observerList = new ArrayList<>();
        this.matchScore = matchScore;
        this.bowls = bowls;
        this.out = out;
    }

    public MatchStation(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void add(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        MatchDto matchDto = new MatchDto(this.matchScore, this.bowls, this.out);
        for (Observer observer : observerList) {
            observer.update(matchDto);
        }
    }

    public void change(int matchScore, int bowls, int out) {
        this.matchScore = matchScore;
        this.bowls = bowls;
        this.out = out;
        this.notifyObservers();
    }
}
