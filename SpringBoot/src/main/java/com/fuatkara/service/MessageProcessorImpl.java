package com.fuatkara.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value= "MessageProcessor")
public class MessageProcessorImpl implements MessageProcessor {
	
	@Autowired   //Adam diyor MessageServici hepsi kullaniyor tamam bunlari bagladim ama sen hangisini istiyosun diyor	
	@Qualifier(value="EmailService")  // Qualifier'la tam belirliyoz biz bunu istiyoruz diye, gidiyoruz baska classa 
										//hangisnde MessageService varsa @Service(value="EmailService") diyoruz
										// 5.Oturum 2:59:00 dk da anlatiyor autowired ve qualifier
	MessageService messageService;

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processorMsg(String message) {
		System.out.println("MessageProcessorImpl " + message);

	}

}
