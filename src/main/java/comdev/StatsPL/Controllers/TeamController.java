package comdev.StatsPL.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comdev.StatsPL.Entities.Team;
import services.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {
	@Autowired
	TeamService service;
	
	@GetMapping
	public List<Team> getTeams(){
		return service.getTeams();
	}
	@PostMapping
	public Team addTeam(@RequestBody Team team) {
		return service.newTeam(team);
	}
}
