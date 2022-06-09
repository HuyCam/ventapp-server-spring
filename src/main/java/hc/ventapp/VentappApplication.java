package hc.ventapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "hc.ventapp.repositories")
@SpringBootApplication
public class VentappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VentappApplication.class, args);
	}

}
