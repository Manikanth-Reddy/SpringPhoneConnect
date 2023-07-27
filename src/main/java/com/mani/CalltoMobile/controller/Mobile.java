package com.mani.CalltoMobile.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@Controller
public class Mobile {
	private final static String FROM_NUMBER = "+15392142714";
	@RequestMapping("/{mobile}")
	public void cal(@PathVariable("mobile")String mob) throws URISyntaxException {
		Call.creator(new PhoneNumber("+91"+mob), new PhoneNumber(FROM_NUMBER),
				   new URI("http://demo.twilio.com/docs/voice.xml")).create();
	}
}
