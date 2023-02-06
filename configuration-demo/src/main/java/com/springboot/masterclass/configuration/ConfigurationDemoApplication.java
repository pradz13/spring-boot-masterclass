package com.springboot.masterclass.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class ConfigurationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationDemoApplication.class, args);
	}

	@Component
	public static class ApplicationConfigurationInitializer implements CommandLineRunner {

		@Value("${app.version}")
		private String appVerion;

		@Autowired
		private ApplicationProperties applicationProperties;

		@Override
		public void run(String... args) throws Exception {
			System.out.println("Value annotation example : " + appVerion);
			System.out.println("Configuration properties example : " + applicationProperties.getVersion());
			System.out.println(applicationProperties);
		}
	}

}
