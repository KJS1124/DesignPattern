package com.kjs.headfirstjava.com.kjs.headfirstjava.observerpattern;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-18
 * Time:16:26
 */
public class TVScreen implements Observer{
    private Integer matchScore;
    private Integer bowls;
    private Integer out;
    private Subject subject;

    public TVScreen(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(MatchDto matchDto) {
        this.bowls = matchDto.getBowls();
        this.matchScore = matchDto.getMatchScore();
        this.out = matchDto.getOut();
        this.display();
    }

    public void display() {
        System.out.println("Printing data for TVScreen screen : " + this.matchScore +" "+ this.bowls + " "+ this.out);
    }
}
