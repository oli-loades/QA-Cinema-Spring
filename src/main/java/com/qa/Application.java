package com.qa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.AccountConstants;
import com.qa.util.AccoutnNumberGenerator;

@SpringBootApplication
public class Application {
	
	@Bean 
	RestTemplate restTemplate(){
		return new RestTemplate(); 
	}
	
	@Bean AccoutnNumberGenerator accoutnNumberGenerator() {
		return new AccoutnNumberGenerator(AccountConstants.ACCOUNT_NUM_LENGTH);
	}
	
    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }
}

