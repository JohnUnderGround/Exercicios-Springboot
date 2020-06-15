package john.underground.exemploinjecaodedependencia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author John
 */

@SpringBootApplication
public class ExemploinjecaodedependenciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploinjecaodedependenciaApplication.class, args);
	}

	Pet pet = new Pet();
	pet.execute();

}
