package comdev.StatsPL.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comdev.StatsPL.Entities.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

}
