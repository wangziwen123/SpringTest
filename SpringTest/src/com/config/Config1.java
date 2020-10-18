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
 * Java�������DI    @Configuration
 * 
 * ���ַ�ʽ
 * 1.@beanע����ʽ��
 * 2.@importע����ʽ��
 * 3.FactoryBean ע����ʽ��
 * 
 * 
 * @author WangZH
 *
 */
@Configuration

//@Import({com.entity.Students.class,com.entity.Student.class}) //��һ�ַ�ʽ
//@Import(Ҫ���뵽�����е����)�������оͻ��Զ�ע����������idĬ����ȫ����

//@Import({ImportBeanImpl.class})  //�ڶ��ַ�ʽ
//ImportSelector:������Ҫ����������ȫ��������

@Import({ImportFactoryBean.class})   //�����ַ�ʽ
//ImportBeanDefinitionRegistrar:�ֶ�ע��bean��������

@ComponentScan(value = "com")    //ɨ����
public class Config1 {
	
	@Bean( value = "student3" ,initMethod = "initTest",destroyMethod = "destroyTest")
	@Scope(value = "singleton")
	@Autowired
	@Lazy     //�ӳټ���
	public Student Student3(Address address) {
		
		Student student = new Student(1,"wzh",23,true,address) ;
		
		
		return student ;
		
	}
	
	@Bean(value = "address3")
	@Scope(value = "prototype")
	public Address Address3() {
		
		Address address = new Address("������ѧ","μ����") ;
		return address ;
		
	}

}
