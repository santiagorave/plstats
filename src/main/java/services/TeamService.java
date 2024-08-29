package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comdev.StatsPL.Entities.Team;
import comdev.StatsPL.Repositoires.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository repo;
	
	public List<Team> getTeams(){
		return repo.findAll();
	}
	 
	public Team newTeam(Team team) {
		return repo.save(team);
	} 
}
