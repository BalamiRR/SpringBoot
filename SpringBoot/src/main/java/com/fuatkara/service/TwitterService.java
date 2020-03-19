package com.fuatkara.service;

import org.springframework.stereotype.Service;

@Service(value= "TwitterService")
public class TwitterService implements MessageService {
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Twitter Service " + message);
	}
	
}
