package io.github.somunaexe.dispenser;

import io.github.somunaexe.dispenser.run.Location;
import io.github.somunaexe.dispenser.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DispenserApplication {
	private static final Logger log = LoggerFactory.getLogger(DispenserApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DispenserApplication.class, args);
		log.info("Change");

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 4, Location.INDOOR);
            log.info("Run: {}", run);
		};
	}


}
