package com.cyberark.conjur.plugintest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConjurSpringCloudPluginTest implements CommandLineRunner{
	private static Logger logger = LoggerFactory.getLogger(ConjurSpringCloudPluginTest.class);


	@Value("${data/bnl/ocp-apps/url}")
	//@ConjurValue(key="data/bnl/ocp-apps/url")
	private byte[] url;
	
	@Value("${data/bnl/ocp-apps/username}")
	//@ConjurValue(key ="data/bnl/ocp-apps/username")
	private byte[] username;


	@Value("${data/bnl/ocp-apps/password}")
	private byte[] password;
	
    public static void main(String[] args) {
        SpringApplication.run(ConjurSpringCloudPluginTest.class, args);
    }

    
	public void run(String... args) {
		logger.info("By Using Standard Spring annotation -->  " + new String(username) + "  " );
		logger.info("By Using Standard Spring annotation -->  " + new String(url) + "  " );
		logger.info("By Using Standard Spring annotation -->  " + new String(password) + "  " );
	}

	
}
