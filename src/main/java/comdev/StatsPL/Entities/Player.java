package comdev.StatsPL.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
}
