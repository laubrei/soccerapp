/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.TreeSet;

/**
 *
 * @author schueler
 */
@Entity
public class Player {
    @Id
    private int id;
    private String name;
    private boolean isGoalie;
    private boolean isDefender;
    private boolean isMidFielder;
    private boolean isForward;
    private boolean isActive;
    private TreeSet<Statistic> tsStatistic;

    public Player(int id, String name, boolean isGoalie, boolean isMidFielder, boolean isDefender, boolean isForward, boolean isActive) {
        this.id = id;
        this.name = name;
        this.isGoalie = isGoalie;
        this.isMidFielder = isMidFielder;
        this.isDefender = isDefender;
        this.isForward = isForward;
        this.isActive = isActive;
        this.tsStatistic = new TreeSet<>();
    }
    
    
    
    public Player(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TreeSet<Statistic> getTsStatistic() {
        return tsStatistic;
    }

    public void setTsStatistic(TreeSet<Statistic> tsStatistic) {
        this.tsStatistic = tsStatistic;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGoalie() {
        return isGoalie;
    }

    public void setGoalie(boolean goalie) {
        isGoalie = goalie;
    }

    public boolean isDefender() {
        return isDefender;
    }

    public void setDefender(boolean defender) {
        isDefender = defender;
    }

    public boolean isMidFielder() {
        return isMidFielder;
    }

    public void setMidFielder(boolean midFielder) {
        isMidFielder = midFielder;
    }

    public boolean isForward() {
        return isForward;
    }

    public void setForward(boolean forward) {
        isForward = forward;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void updateProfile(boolean _isGoalie, boolean _isDefender, boolean _isMidFielder, boolean _isForward, boolean _isActive) throws Exception {
        this.setGoalie(_isGoalie);
        this.setDefender(_isDefender);
        this.setMidFielder(_isMidFielder);
        this.setForward(_isForward);
        this.setActive(_isActive);
    }

    public Position getSelectedPosition() {
        Position pos = null;
        if (isGoalie()) {
            pos = Position.GOALIE;
        } else {
            if (isDefender()) {
                pos = Position.DEFENDER;
            } else {
                if (isMidFielder()) {
                    pos = Position.MIDFIELDER;
                } else {
                    if (isForward()) {
                        pos = Position.FORWARD;
                    }
                }
            }
        }
        return pos;
    }
}
