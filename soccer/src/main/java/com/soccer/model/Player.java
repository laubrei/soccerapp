/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author schueler
 */
@Entity
public class Player implements Serializable{
    @Id
    @Column(name="ID")
    private int id;
    private String name;
    private boolean isGoalie;
    private boolean isDefender;
    private boolean isMidFielder;
    private boolean isForward;
    private boolean isActive;

    public Player() {
    }
    
    public Player(int id, String name, boolean isGoalie, boolean isDefender, boolean isMidFielder, boolean isForward, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isGoalie = isGoalie;
        this.isDefender = isDefender;
        this.isMidFielder = isMidFielder;
        this.isForward = isForward;
        this.isActive = isActive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public int getIdPlayer() {
        return id;
    }

    public void setIdPlayer(int idPlayer) {
        this.id = idPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsGoalie() {
        return isGoalie;
    }

    public void setIsGoalie(boolean isGoalie) {
        this.isGoalie = isGoalie;
    }

    public boolean isIsDefender() {
        return isDefender;
    }

    public void setIsDefender(boolean isDefender) {
        this.isDefender = isDefender;
    }

    public boolean isIsMidFielder() {
        return isMidFielder;
    }

    public void setIsMidFielder(boolean isMidFielder) {
        this.isMidFielder = isMidFielder;
    }

    public boolean isIsForward() {
        return isForward;
    }

    public void setIsForward(boolean isForward) {
        this.isForward = isForward;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    
}
