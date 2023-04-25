package com.cyberark.conjur.plugintest;

import com.cyberark.conjur.springboot.annotations.ConjurValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ConjurSpringCloudPluginTest implements CommandLineRunner{
	private static Logger logger = LoggerFactory.getLogger(ConjurSpringCloudPluginTest.class);


	@ConjurValue(key="data/bnl/ocp-apps/url")
	private byte[] url;

	/**
	 * The Username.
	 */
	@ConjurValue(key ="data/bnl/ocp-apps/username")
	private byte[] username;
	
	
    public static void main(String[] args) {
        SpringApplication.run(ConjurSpringCloudPluginTest.class, args);
    }

    
	public void run(String... args) {
		logger.info("By Using Standard Spring annotation -->  " + new String(url) + "  " );
		logger.info("By Using Standard Spring annotation -->  " + new String(username) + "  " );
	}

	
}