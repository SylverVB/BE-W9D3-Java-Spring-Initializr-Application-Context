package com.app;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitializrApplication {

	public static void main(String[] args) {
		// Load the .env file using dotenv
        Dotenv dotenv = Dotenv.load();

        // Optionally, print them out to ensure they're loaded (for debugging purposes)
        System.out.println("DB URL: " + dotenv.get("dbURL"));
        System.out.println("DB User: " + dotenv.get("dbUSER"));
        System.out.println("DB Password: " + dotenv.get("dbPASSWORD"));

		SpringApplication.run(SpringInitializrApplication.class, args);
	}
    
}