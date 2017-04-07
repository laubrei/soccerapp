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
    private Player idPlayer;
    private SoccerMatch idMatch;
    
    public StatisticKey(){
        
    }

    public StatisticKey(Player idPlayer, SoccerMatch idMatch) {
        this.idPlayer = idPlayer;
        this.idMatch = idMatch;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.idPlayer);
        hash = 73 * hash + Objects.hashCode(this.idMatch);
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
        if (!Objects.equals(this.idPlayer, other.idPlayer)) {
            return false;
        }
        if (!Objects.equals(this.idMatch, other.idMatch)) {
            return false;
        }
        return true;
    }
    

    public Player getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(Player idPlayer) {
        this.idPlayer = idPlayer;
    }

    public SoccerMatch getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(SoccerMatch idMatch) {
        this.idMatch = idMatch;
    }    
}
