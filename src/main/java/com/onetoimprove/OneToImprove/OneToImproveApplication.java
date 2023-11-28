package com.onetoimprove.OneToImprove;

import com.onetoimprove.OneToImprove.models.SuperAdmin;
import com.onetoimprove.OneToImprove.repositories.SuperAdminRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToImproveApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToImproveApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(SuperAdminRepository superAdminRepository) {
		return (args) -> {
			SuperAdmin adminPrincipal = new SuperAdmin("Daniel Lopez", "Team Lead", "daniel.lopez@onetoimprove.com", "testing123","imagen.png");

			superAdminRepository.save(adminPrincipal);
		};
	}
}
