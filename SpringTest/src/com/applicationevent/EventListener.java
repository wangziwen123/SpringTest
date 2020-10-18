package com.applicationevent;

import org.springframework.context.ApplicationListener;
//�¼�������
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<Event1>{
	
	
	@Override
	public void onApplicationEvent(Event1 event) {
		System.out.println("EventListener:"+event.getMsg());
		
	}
}
