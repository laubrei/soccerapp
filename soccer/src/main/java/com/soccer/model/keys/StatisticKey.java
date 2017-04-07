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

/**
 *
 * @author schueler
 */
public class StatisticKey implements Serializable{
    private Player fkPlayer;
    private SoccerMatch fkMatch;
    
    public StatisticKey(){
        
    }

    public StatisticKey(Player fkPlayer, SoccerMatch fkMatch) {
        this.fkPlayer = fkPlayer;
        this.fkMatch = fkMatch;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.fkPlayer);
        hash = 73 * hash + Objects.hashCode(this.fkMatch);
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
        if (!Objects.equals(this.fkPlayer, other.fkPlayer)) {
            return false;
        }
        if (!Objects.equals(this.fkMatch, other.fkMatch)) {
            return false;
        }
        return true;
    }

    public Player getFkPlayer() {
        return fkPlayer;
    }

    public void setFkPlayer(Player fkPlayer) {
        this.fkPlayer = fkPlayer;
    }

    public SoccerMatch getFkMatch() {
        return fkMatch;
    }

    public void setFkMatch(SoccerMatch fkMatch) {
        this.fkMatch = fkMatch;
    }
    

    
}
