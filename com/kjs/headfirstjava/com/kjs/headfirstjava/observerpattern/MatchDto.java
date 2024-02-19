package com.kjs.headfirstjava.com.kjs.headfirstjava.observerpattern;

/**
 * Author: Karanjot Singh
 * User:karanjotsingh
 * Date:2024-02-18
 * Time:16:28
 */
public class MatchDto {
    private Integer matchScore;
    private Integer bowls;
    private Integer out;

    public MatchDto(Integer matchScore, Integer bowls, Integer out) {
        this.matchScore = matchScore;
        this.bowls = bowls;
        this.out = out;
    }

    public Integer getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(Integer matchScore) {
        this.matchScore = matchScore;
    }

    public Integer getBowls() {
        return bowls;
    }

    public void setBowls(Integer bowls) {
        this.bowls = bowls;
    }

    public Integer getOut() {
        return out;
    }

    public void setOut(Integer out) {
        this.out = out;
    }
}
