package com.mani.CalltoMobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;

@SpringBootApplication
public class CallToAnyMobileApplication {
	private final static String SID_ACCOUNT = "ACae19fc7dc9ae25313cc53a4c7ddb454f";
	private final static String AUTH_ID = "d6fe82ad40aaffd774edf0aea77f7ae8";
	
	static {
		Twilio.init(SID_ACCOUNT, AUTH_ID);
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CallToAnyMobileApplication.class, args);
	}

}
