package comdev.StatsPL.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int player_id;
	private String name;
	private String nationality;
	private String nationality_img;
	private String position;
	private int goals;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,  CascadeType.REFRESH})
	@JoinColumn(name="team_id", referencedColumnName = "team_id")
	private Team team;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNationality_img() {
		return nationality_img;
	}
	public void setNationality_img(String nationality_img) {
		this.nationality_img = nationality_img;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return this.player_id;
	}
	
	public void setId(int newId) {
		this.player_id = newId;
	}
	
	public String getTeam() {
		return this.team.getName();
	}
	
	public void setTeamName(Team newTeam) {
			this.team.setName(newTeam.getName());
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	

	
}
