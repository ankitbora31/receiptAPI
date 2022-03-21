package com.springrest.receipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springrest.receipt.entities.contactDetails;
import com.springrest.receipt.entities.donarDetails;
import com.springrest.receipt.repositories.donarRepo;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
@EnableAutoConfiguration
public class ReceiptApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ReceiptApplication.class, args);
	}
	
	@Autowired
	private donarRepo drepo;

	@Override
	public void run(String... args) throws Exception {
		donarDetails donar = new donarDetails("Donar1", 
				"10000", "UPI", 
				"newCategory");
		contactDetails contact = new contactDetails(
				"90128xx31", "gmail.com", "dptetn22",
				"delhi", "keep doing the good work");
		donar.setDdetails(contact);
		drepo.save(donar);
		
	}

}
