package br.com.personal.governmentspending;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients	
@SpringBootApplication
public class GovernmentSpendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GovernmentSpendingApplication.class, args);
	}

}
