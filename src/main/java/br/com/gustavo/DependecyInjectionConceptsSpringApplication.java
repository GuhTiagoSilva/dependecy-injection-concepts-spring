package br.com.gustavo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gustavo.services.PayService;

@SpringBootApplication
public class DependecyInjectionConceptsSpringApplication implements CommandLineRunner {

	@Autowired
	private PayService payService;

	public static void main(String[] args) {
		SpringApplication.run(DependecyInjectionConceptsSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		double finalPrice = payService.finalPrice(300.0, "SC");
		System.out.println("Result = " + finalPrice);
	}

}
