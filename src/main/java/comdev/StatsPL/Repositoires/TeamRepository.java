package comdev.StatsPL.Repositoires;

import org.springframework.data.jpa.repository.JpaRepository;

import comdev.StatsPL.Entities.Team;

public interface TeamRepository extends JpaRepository<Team,Integer> {

}
