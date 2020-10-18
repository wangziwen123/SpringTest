package com.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.entity.Address;
import com.entity.Student;
/**
 * Java配置类的DI    @Configuration
 * 
 * 三种方式
 * 1.@bean注解形式的
 * 2.@import注解形式的
 * 3.FactoryBean 注解形式的
 * 
 * 
 * @author WangZH
 *
 */
@Configuration

//@Import({com.entity.Students.class,com.entity.Student.class}) //第一种方式
//@Import(要导入到容器中的组件)；容器中就会自动注册这个组件，id默认是全类名

//@Import({ImportBeanImpl.class})  //第二种方式
//ImportSelector:返回需要导入的组件的全类名数组

@Import({ImportFactoryBean.class})   //第三种方式
//ImportBeanDefinitionRegistrar:手动注册bean到容器中

@ComponentScan(value = "com")    //扫描器
public class Config1 {
	
	@Bean( value = "student3" ,initMethod = "initTest",destroyMethod = "destroyTest")
	@Scope(value = "singleton")
	@Autowired
	@Lazy     //延迟加载
	public Student Student3(Address address) {
		
		Student student = new Student(1,"wzh",23,true,address) ;
		
		
		return student ;
		
	}
	
	@Bean(value = "address3")
	@Scope(value = "prototype")
	public Address Address3() {
		
		Address address = new Address("西安大学","渭南市") ;
		return address ;
		
	}

}
