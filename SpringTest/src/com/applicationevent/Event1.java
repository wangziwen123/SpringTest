package com.applicationevent;

import org.springframework.context.ApplicationEvent;
//自定义事件
public class Event1 extends ApplicationEvent {
	
	private String msg ;
	
	public Event1(Object source,String msg) {
		super(source);
		this.msg = msg ;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
