package comdev.StatsPL.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="matches")
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int team_id1;
	private int team_id2;
	private int result;
	private List<Object> playersScored;
	private int goalsTeam1;
	private int goalsTeam2;
	public Match() {

	}



	public Match(int team_id1, int team_id2, int result, List<Object> players, int goalsTeam1, int goalsTeam2) {
		this.team_id1 = team_id1;
		this.team_id2 = team_id2;
		this.result = result;
		this.playersScored = players;
		this.goalsTeam1 = goalsTeam1;
		this.goalsTeam2 = goalsTeam2;
	}

	public int getTeam_id1() {
		return team_id1;
	}

	public void setTeam_id1(int team_id1) {
		this.team_id1 = team_id1;
	}

	public int getTeam_id2() {
		return team_id2;
	}

	public void setTeam_id2(int team_id2) {
		this.team_id2 = team_id2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public List<Object> getPlayersScored() {
		return playersScored;
	}

	public void setPlayersScored(List<Object> playersScored) {
		this.playersScored = playersScored;
	}

	public int getGoalsTeam1() {
		return goalsTeam1;
	}

	public void setGoalsTeam1(int goalsTeam1) {
		this.goalsTeam1 = goalsTeam1;
	}

	public int getGoalsTeam2() {
		return goalsTeam2;
	}

	public void setGoalsTeam2(int goalsTeam2) {
		this.goalsTeam2 = goalsTeam2;
	}

}
