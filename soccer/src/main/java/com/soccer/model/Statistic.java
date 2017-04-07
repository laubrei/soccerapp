package com.soccer.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import com.soccer.model.keys.StatisticKey;

@Entity
@IdClass(StatisticKey.class)
public class Statistic implements Serializable{

    @Id
    @ManyToOne
    private Player idPlayer;
    
    @Id
    @ManyToOne
    private Match matchDate;
    
    private int goalsShot;
    private int goalsPenalty;
    private int goalsHead;
    private int goalsHeadSnow;
    private int goalsOwn;
    private int nutmegs;
    private String team;

    public Statistic() {
    }
    public Statistic(Player idPlayer, Match matchDate, int goalsShot, int goalsPenalty, 
            int goalsHead, int goalsHeadSnow, int goalsOwn, int nutmegs, String team) {
        this.idPlayer = idPlayer;
        this.matchDate = matchDate;
        this.goalsShot = goalsShot;
        this.goalsPenalty = goalsPenalty;
        this.goalsHead = goalsHead;
        this.goalsHeadSnow = goalsHeadSnow;
        this.goalsOwn = goalsOwn;
        this.nutmegs = nutmegs;
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    public Player getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Player idPlayer) {
        this.idPlayer = idPlayer;
    }

    public Match getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Match matchDate) {
        this.matchDate = matchDate;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public void setGoalsShot(int goalsShot) {
        this.goalsShot = goalsShot;
    }

    public int getGoalsPenalty() {
        return goalsPenalty;
    }

    public void setGoalsPenalty(int goalsPenalty) {
        this.goalsPenalty = goalsPenalty;
    }

    public int getGoalsHead() {
        return goalsHead;
    }

    public void setGoalsHead(int goalsHead) {
        this.goalsHead = goalsHead;
    }

    public int getGoalsHeadSnow() {
        return goalsHeadSnow;
    }

    public void setGoalsHeadSnow(int goalsHeadSnow) {
        this.goalsHeadSnow = goalsHeadSnow;
    }

    public int getGoalsOwn() {
        return goalsOwn;
    }

    public void setGoalsOwn(int goalsOwn) {
        this.goalsOwn = goalsOwn;
    }

    public int getNutmegs() {
        return nutmegs;
    }

    public void setNutmegs(int nutmegs) {
        this.nutmegs = nutmegs;
    }

    
}
