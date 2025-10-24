package com.eazybytes.eazystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@EnableCaching
@SpringBootApplication
public class EazystoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazystoreApplication.class, args);
	}

}
