package comdev.StatsPL.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import comdev.StatsPL.Entities.Player;
import services.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {
	
	@Autowired
	PlayerService service;
	
	
	@GetMapping
	public List<Player> allPlayers(){
		return service.getPlayers();
	}
	
	@GetMapping("/{id}")
	public Player getPlayer(@PathVariable int id){
		return service.getPlayer(id);
	}
	@PostMapping
	public Player addPlayer(@RequestBody Player player) {
		return service.addPlayer(player);
	}
	@PutMapping("/{id}")
	public Player updatePlayer(@PathVariable int id, @RequestBody Player player) {
		return service.updatePlayer(id,player);
	}
	
	@PatchMapping("/{id}/goals")
	public Player updateGoals(@PathVariable int id, @RequestBody int goals) {
		return service.updateGoals(id,goals);
	}
	
	
	
	

}
