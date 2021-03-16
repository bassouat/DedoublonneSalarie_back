package com.dedoublonnesalarie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.dedoublonnesalarie.*")
@EntityScan("com.dedoublonnesalaire.entities")
@EnableJpaRepositories("com.dedoublonnesalarie.dao")
public class DedoublonneSalarieApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DedoublonneSalarieApplication.class, args);
	}

}
