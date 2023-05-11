package com.cyberark.conjur.plugintest;

import com.cyberark.conjur.springboot.annotations.ConjurValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConjurSpringCloudSample implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(ConjurSpringCloudSample.class);


	@Value("${data/bnl/ocp-apps/url}")
	private byte[] url;
	
	@ConjurValue(key ="data/bnl/ocp-apps/username")
	private byte[] username;


	@Value("${data/bnl/ocp-apps/password}")
	private byte[] password;
	
    public static void main(String[] args) {
        SpringApplication.run(ConjurSpringCloudSample.class, args);
    }

    
	public void run(String... args) {
		logger.info("By Using ConjurValue Spring annotation -->  " + new String(username));
		logger.info("By Using Standard Spring annotation -->  " + new String(url));
		logger.info("By Using Standard Spring annotation -->  " + new String(password));
	}

	
}
