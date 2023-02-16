package com.itau.agro.TechnicalDebt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TechnicalDebtApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicalDebtApplication.class, args);
	}

}
