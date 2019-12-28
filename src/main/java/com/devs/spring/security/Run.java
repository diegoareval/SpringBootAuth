package com.devs.spring.security;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class Run implements CommandLineRunner{

	private final static String ACCOUNT_SID="SECRET";
	private final static String AUTH_TOKEN="SECRET";
	public static final String TWILIO_NUMBER = "+19175254972";
	public static final String DESTINATION_NUMBER = "+50376540104";
	public static final String MESSAGE = "Bienvenido al sistema";
	
	
    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		SendMessage();  
	}
	public void SendMessage() {
		try {
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			  Message.creator(
			            new PhoneNumber(DESTINATION_NUMBER),
			            new PhoneNumber(TWILIO_NUMBER),
			            MESSAGE)
			            .create();
			System.out.println("mensaje enviado con exito");
		}catch(Exception ex) {
			System.out.println("error: "+ex.getMessage());
		}
	}

}
