package com.devs.spring.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class Run implements CommandLineRunner{

	private final static String ACCOUNT_SID="ACb474a32f80de36c56e21ba0472455a44";
	private final static String AUTH_TOKEN="52677f655b80be239a358d2a3a87cdb1";
	public static final String TWILIO_NUMBER = "+19175254972";
	
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			  Message.creator(
			            new PhoneNumber("+50376540104"),
			            new PhoneNumber(TWILIO_NUMBER),
			            "Bienvenido al sistema")
			            .create();
			System.out.println("mensaje enviado con exito");
		}catch(Exception ex) {
			System.out.println("error: "+ex.getMessage());
		}
		  
		
	}

}
