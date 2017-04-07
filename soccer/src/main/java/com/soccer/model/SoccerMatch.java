package com.soccer.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SoccerMatch implements Serializable{
    
    @Id
    private int id;
    private Date date;
    
    @Column(name="goals_team_1_made")
    private int goalsTeam1Made;
    @Column(name="goals_team_2_made")
    private int goalsTeam2Made;
    
    public SoccerMatch() {}

    public SoccerMatch(int id, Date date, int goalsTeam1Made, int goalsTeam2Made) {
        this.id = id;
        this.date = date;
        this.goalsTeam1Made = goalsTeam1Made;
        this.goalsTeam2Made = goalsTeam2Made;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SoccerMatch other = (SoccerMatch) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGoalsTeam1Made() {
        return goalsTeam1Made;
    }

    public void setGoalsTeam1Made(int goalsTeam1Made) {
        this.goalsTeam1Made = goalsTeam1Made;
    }

    public int getGoalsTeam2Made() {
        return goalsTeam2Made;
    }

    public void setGoalsTeam2Made(int goalsTeam2Made) {
        this.goalsTeam2Made = goalsTeam2Made;
    }
}