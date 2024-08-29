package comdev.StatsPL.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;

import comdev.StatsPL.Entities.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer> {

}
