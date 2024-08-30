package comdev.StatsPL.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comdev.StatsPL.Entities.Player;
import comdev.StatsPL.Entities.Team;
import services.PlayerService;
import services.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {
	@Autowired
	TeamService service;
	@Autowired
	PlayerService servicePlayer;
	
	@GetMapping
	public List<Team> getTeams(){
		return service.getTeams();
	}
	@PostMapping
	public Team addTeam(@RequestBody Team team) {
		return service.newTeam(team);
	}
	
	@PutMapping("/{id}/players/{player_id}")
	public Team addPlayer(@PathVariable int id, @PathVariable int player_id ) {
		Player player = servicePlayer.getPlayer(player_id);
		return service.addPlayer(id, player);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTeam(@PathVariable int id) {
		 service.deleteTeam(id);
	}
}
