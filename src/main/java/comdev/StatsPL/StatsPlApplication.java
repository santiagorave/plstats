package comdev.StatsPL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
"comdev.StatsPL.Controllers", "comdev.StatsPL.Entities","Repositoires","services"})
public class StatsPlApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatsPlApplication.class, args);
	}

}
