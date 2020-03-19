 package com.fuatkara.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import com.fuatkara.service.MessageProcessor;

@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")   //Burda src/main/resources'u cagriyoruz
								//yildiz isareti ise, o src dekilerin hepsini cagriyor.
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processorMsg("Service");
	}

//	@SpringBootApplication
//	@RestController
//	public class Application {
//
//		public static void main(String[] args) {
//			SpringApplication.run(Application.class, args);
//		}
//		
//		//localhost:8080/index
//		@RequestMapping(value="/index")
//		public String Method() {
//			System.out.println("Method print!!");
//			return "Methods";
//		}
//
//		@RequestMapping(value="/ms")
//		public String printT() {
//			System.out.println("Methods");
//			return "MethodSyso";
//		}

}
