package comdev.StatsPL.Entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="teams")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int team_id;
	private String name;
	private String team_img;
	private int points;
	private int position;
	private int matchesPlayed;
	private int matchesWon;
	private int matchesDrawn;
	private int matchesLost;
	private int gf;
	private int ga;
	private int gd;
	@OneToMany(mappedBy="team",cascade=CascadeType.ALL)		
	private List<Player> players = new ArrayList<>();

	public Team() {

	}
	
	public interface ProjectIdAndName{
	    String getId();
	    String getName();
	}

	public Team(String name, List<Player> players) {
		this.name = name;
		this.players = players;
	}
	
	public int getTeamId() {
		return this.team_id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public List<Player> getPlayers(){
		return this.players;
	}
	public void setPlayers(List<Player> newPlayers){
		this.players = newPlayers;
	}
	
	public void addPlayer(Player p) {
		players.add(p);
		p.setTeamName(this);
	}

	public String getTeam_img() {
		return team_img;
	}

	public void setTeam_img(String team_img) {
		this.team_img = team_img;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getMatchesPlayed() {
		return matchesPlayed;
	}

	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	public int getMatchesWon() {
		return matchesWon;
	}

	public void setMatchesWon(int matchesWon) {
		this.matchesWon = matchesWon;
	}

	public int getMatchesDrawn() {
		return matchesDrawn;
	}

	public void setMatchesDrawn(int matchesDrawn) {
		this.matchesDrawn = matchesDrawn;
	}

	public int getMatchesLost() {
		return matchesLost;
	}

	public void setMatchesLost(int matchesLost) {
		this.matchesLost = matchesLost;
	}

	public int getGf() {
		return gf;
	}

	public void setGf(int gf) {
		this.gf = gf;
	}

	public int getGa() {
		return ga;
	}

	public void setGa(int ga) {
		this.ga = ga;
	}

	public int getGd() {
		return gd;
	}

	public void setGd(int gd) {
		this.gd = gd;
	}
	

}
