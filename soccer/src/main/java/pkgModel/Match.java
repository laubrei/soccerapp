package pkgModel;
import java.util.Date;
import java.util.TreeSet;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {
    
    @Id
    private int id;
    private Date date;
    private int goalsMadeTeam1;
    private int goalsMadeTeam2;
    private TreeSet<Player> tsTeamUnassigned;
    private TreeSet<Player> tsTeam1;
    private TreeSet<Player> tsTeam2;
    private TreeSet<Statistic> tsStatistics;

    public Match() {}
    
    public Match(int id, Date date, int goalsMadeTeam1, int goalsMadeTeam2, TreeSet<Player> tsTeamUnassigned, TreeSet<Player> tsTeam1, TreeSet<Player> tsTeam2, TreeSet<Statistic> tsStatistics) {
        this.id = id;
        this.date = date;
        this.goalsMadeTeam1 = goalsMadeTeam1;
        this.goalsMadeTeam2 = goalsMadeTeam2;
        this.tsTeamUnassigned = tsTeamUnassigned;
        this.tsTeam1 = tsTeam1;
        this.tsTeam2 = tsTeam2;
        this.tsStatistics = tsStatistics;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGoalsMadeTeam1() {
        return goalsMadeTeam1;
    }

    public void setGoalsMadeTeam1(int goalsMadeTeam1) {
        this.goalsMadeTeam1 = goalsMadeTeam1;
    }

    public int getGoalsMadeTeam2() {
        return goalsMadeTeam2;
    }

    public void setGoalsMadeTeam2(int goalsMadeTeam2) {
        this.goalsMadeTeam2 = goalsMadeTeam2;
    }

    public TreeSet<Player> getTsTeamUnassigned() {
        return tsTeamUnassigned;
    }

    public void setTsTeamUnassigned(TreeSet<Player> tsTeamUnassigned) {
        this.tsTeamUnassigned = tsTeamUnassigned;
    }

    public TreeSet<Player> getTsTeam1() {
        return tsTeam1;
    }

    public void setTsTeam1(TreeSet<Player> tsTeam1) {
        this.tsTeam1 = tsTeam1;
    }

    public TreeSet<Player> getTsTeam2() {
        return tsTeam2;
    }

    public void setTsTeam2(TreeSet<Player> tsTeam2) {
        this.tsTeam2 = tsTeam2;
    }

    public TreeSet<Statistic> getTsStatistics() {
        return tsStatistics;
    }

    public void setTsStatistics(TreeSet<Statistic> tsStatistics) {
        this.tsStatistics = tsStatistics;
    }

    @Override
    public String toString() {
        return date + ", " + goalsMadeTeam1 + ":" + goalsMadeTeam2;
    }
}