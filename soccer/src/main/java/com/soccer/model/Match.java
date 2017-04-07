package com.soccer.model;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match implements Serializable{
    
    @Id
    private int id;
    private Date date;
    private int goalsMade1Team;
    private int goalsMade2Team;
    
    public Match() {}

    public Match(int id, Date date, int goalsMade1Team, int goalsMade2Team) {
        this.id = id;
        this.date = date;
        this.goalsMade1Team = goalsMade1Team;
        this.goalsMade2Team = goalsMade2Team;
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
        final Match other = (Match) obj;
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

    public int getGoalsMade1Team() {
        return goalsMade1Team;
    }

    public void setGoalsMade1Team(int goalsMade1Team) {
        this.goalsMade1Team = goalsMade1Team;
    }

    public int getGoalsMade2Team() {
        return goalsMade2Team;
    }

    public void setGoalsMade2Team(int goalsMade2Team) {
        this.goalsMade2Team = goalsMade2Team;
    }

    
}