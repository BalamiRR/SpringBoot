package com.fuatkara.service;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) { 
		System.out.println("Email Service " + message);
	}
	
}
