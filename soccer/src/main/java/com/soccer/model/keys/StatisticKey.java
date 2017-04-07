/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soccer.model.keys;

import java.io.Serializable;
import java.util.Objects;
import com.soccer.model.Match;
import com.soccer.model.Player;

/**
 *
 * @author schueler
 */
public class StatisticKey implements Serializable{
    private Player idPlayer;
    private Match matchDate;
    
    public StatisticKey(){
        
    }

    public StatisticKey(Player idPlayer, Match matchDate) {
        this.idPlayer = idPlayer;
        this.matchDate = matchDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.idPlayer);
        hash = 73 * hash + Objects.hashCode(this.matchDate);
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
        if (!Objects.equals(this.matchDate, other.matchDate)) {
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

    public Match getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Match matchDate) {
        this.matchDate = matchDate;
    }
    
    
}
