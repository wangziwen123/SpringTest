package com.applicationevent;

import java.applet.AppletContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

//事件发布类
@Component("publisher")
public class Publisher implements ApplicationContextAware,FactoryBean<Publisher>{
//	@Autowired
	ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext ;
		
	}
	
	@Autowired
	MessageSource messageSource ;
	
	@Autowired
	ResourceLoader loader ;
	
	public void publish(String msg) {
		System.out.println("---------------------------------------");
		System.out.println(applicationContext.getClass());
		System.out.println(applicationContext.getEnvironment());
		System.out.println(applicationContext.getClassLoader());
		System.out.println(applicationContext.getId());
		applicationContext.publishEvent(new Event1(this, msg));
		System.out.println(messageSource);
		System.out.println(loader.getClass());
		System.out.println(loader.getClassLoader());
		
		System.out.println("***************************************");
		
		System.out.println(applicationContext.getBean("publisher").getClass());
		System.out.println(applicationContext.getBean("&publisher").getClass());

//		System.out.println(applicationContext.getBean("publisher").getClass().getTypeName());

		System.out.println("***************************************");
		System.out.println("---------------------------------------");
	}

	@Override
	public Publisher getObject() throws Exception {
		System.out.println("调用getObject方法");
		
		return new Publisher();
	}

	@Override
	public Class<?> getObjectType() {
		
		System.out.println("调用getObjectType方法");
		return null;
	}

}
