package pkgModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Statistic {

    @Id
    private int id;
    private Match match;
    private int goalsShot;
    private int goalsPenalty;
    private int goalsHead;
    private int goalsHeadSnow;
    private int goalsOwn;
    private int nutmegs;

    public Statistic(int id, Match match, int goalsShot, int goalsPenalty, int goalsHead, int goalsHeadSnow, int goalsOwn, int nutmegs) {
        this.id = id;
        this.match = match;
        this.goalsShot = goalsShot;
        this.goalsPenalty = goalsPenalty;
        this.goalsHead = goalsHead;
        this.goalsHeadSnow = goalsHeadSnow;
        this.goalsOwn = goalsOwn;
        this.nutmegs = nutmegs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
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

    @Override
    public String toString() {
        return "Statistic{"
                + "match=" + match
                + ", goalsShot=" + goalsShot
                + ", goalsPenalty=" + goalsPenalty
                + ", goalsHead=" + goalsHead
                + ", goalsHeadSnow=" + goalsHeadSnow
                + ", goalsOwn=" + goalsOwn
                + ", nutmegs=" + nutmegs
                + '}';
    }
}
