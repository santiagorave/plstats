package comdev.StatsPL.Repositoires;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository; 

import comdev.StatsPL.Entities.Team;
import comdev.StatsPL.Entities.Team.ProjectIdAndName;
@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {
	@Query("select name,team_img from Team")
	List<Object[]> getBasicInfoTeams();
}
 