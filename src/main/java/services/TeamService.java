package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comdev.StatsPL.Entities.Player;
import comdev.StatsPL.Entities.Team;
import comdev.StatsPL.Repositoires.TeamRepository;


@Service
public class TeamService {
	@Autowired
	private TeamRepository repo;
	
	public List<Team> getTeams(){
		return repo.findAll();
	}
	public Team getTeam(int id) {
		return repo.findById(id).get();
	}
	 
	public Team newTeam(Team team) {
		return repo.save(team);
	} 
	
	public Team addPlayer(int id, Player player ) {
		Team team = repo.findById(id).get();
		team.addPlayer(player);
		return repo.save(team);
		
	}
	
	public void deleteTeam(int id) {
		 repo.deleteById(id);
	}
}
