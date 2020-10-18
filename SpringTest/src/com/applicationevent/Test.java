package com.applicationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(EventConfig.class);
		System.out.println("********************************");
		System.out.println(context.getClass());
		System.out.println(context.getId());
		System.out.println(context.getApplicationListeners());
		System.out.println("********************************");
		Publisher publisher = context.getBean(Publisher.class) ;
		publisher.publish("hhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		context.close();
	}

}
