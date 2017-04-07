/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.model.keys;

import java.io.Serializable;
import java.util.Objects;
import com.soccer.model.SoccerMatch;
import com.soccer.model.Player;
import java.util.logging.Logger;

/**
 *
 * @author schueler
 */
public class StatisticKey implements Serializable{
    private int fkPlayer;
    private int fkMatch;
    
    public StatisticKey(){
        
    }

    public StatisticKey(int fkPlayer, int fkMatch) {
        this.fkPlayer = fkPlayer;
        this.fkMatch = fkMatch;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.fkPlayer;
        hash = 89 * hash + this.fkMatch;
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
        final StatisticKey other = (StatisticKey) obj;
        if (this.fkPlayer != other.fkPlayer) {
            return false;
        }
        if (this.fkMatch != other.fkMatch) {
            return false;
        }
        return true;
    }
    
    
    
    public int getFkPlayer() {
        return fkPlayer;
    }

    public void setFkPlayer(int fkPlayer) {
        this.fkPlayer = fkPlayer;
    }

    public int getFkMatch() {
        return fkMatch;
    }

    public void setFkMatch(int fkMatch) {
        this.fkMatch = fkMatch;
    }
    
    
}
