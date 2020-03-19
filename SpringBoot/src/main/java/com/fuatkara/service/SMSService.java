package com.fuatkara.service;

import org.springframework.stereotype.Service;

/*
 * 
 * 3 Farkli yol asagiya siralnanlar ayni anlama geliyor.
 
<bean id="smsService" class="com.fuatkara.service.SMSService"/>

==============
@Bean 

public MessageService smsService() {
}

===============
@Service(value= "SMSService")
 
 * */


@Service(value= "SMSService")
public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("SMS Service " + message);
	}
	
}
