package pkgModel;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match implements Serializable{
    
    @Id
    private Date date;
    private int goalsMadeTeam1;
    private int goalsMadeTeam2;
    
    public Match() {}

    public Match(Date date, int goalsMadeTeam1, int goalsMadeTeam2) {
        this.date = date;
        this.goalsMadeTeam1 = goalsMadeTeam1;
        this.goalsMadeTeam2 = goalsMadeTeam2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.date);
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
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
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
}