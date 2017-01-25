package hu.ibm.gamax.springboot.oauth.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "hu.ibm.gamax.springboot.oauth")
public class Oauth2ResourceOwnerPasswordCredentialDemoApp {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ResourceOwnerPasswordCredentialDemoApp.class, args);
	}
}
