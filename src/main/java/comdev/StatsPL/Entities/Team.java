package comdev.StatsPL.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private int team_id;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="player_id")
	private List<Player> players = new ArrayList<>();

	public Team() {

	}

	public Team(String name, List<Player> players) {
		this.name = name;
		this.players = players;
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
	

}
