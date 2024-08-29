package comdev.StatsPL.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import comdev.StatsPL.Entities.Team;
@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {

}
