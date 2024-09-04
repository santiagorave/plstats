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
	

}
