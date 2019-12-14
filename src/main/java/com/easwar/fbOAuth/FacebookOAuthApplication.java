package com.easwar.fbOAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableOAuth2Sso
public class FacebookOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacebookOAuthApplication.class, args);
		//Create an App in developers.facebook.com
	}

}
