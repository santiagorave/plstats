package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comdev.StatsPL.Entities.Player;
import comdev.StatsPL.Repositoires.PlayerRepository;
import comdev.StatsPL.exception.ResourceNotFoundException;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository repo;
	
	
	public List<Player> getPlayers(){
		return repo.findAll();
	}
	
	public Player addPlayer(Player player) {
		player.setId(0);
		return repo.save(player);
	}
	public Player getPlayer(int id) {
		return repo.findById(id).get();
	}
	
	public Player updatePlayer(int id, Player pl) {
			Player p = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Player not found with id:" + id));
			p.setName(pl.getName());
			p.setNationality(pl.getNationality());
			p.setNationality_img(pl.getNationality_img());
			p.setPosition(pl.getPosition());
			
			return repo.save(p);
	}
}
