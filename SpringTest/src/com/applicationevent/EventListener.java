package com.applicationevent;

import org.springframework.context.ApplicationListener;
//ÊÂ¼þ¼àÌýÆ÷
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<Event1>{
	
	
	@Override
	public void onApplicationEvent(Event1 event) {
		System.out.println("EventListener:"+event.getMsg());
		
	}
}
