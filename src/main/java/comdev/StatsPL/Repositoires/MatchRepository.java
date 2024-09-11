package comdev.StatsPL.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comdev.StatsPL.Entities.Match;


@Repository
public interface MatchRepository extends JpaRepository<Match,Integer> {
 
}
