package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comdev.StatsPL.Entities.Player;
import comdev.StatsPL.Repositoires.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository repo;
	
	
	public List<Player> getPlayers(){
		return repo.findAll();
	}
}
