package com.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.condition.Acondition;
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
	
	@Bean(value = "address4")
	@Conditional(Acondition.class)
	public Address Address4() {
		System.out.println("����ע�⡣��������������������������������");
		
		Address address = new Address("�����Ƽ�","������");
		return address;	
	}
	
	@Bean(value = "address5")
	@Conditional(Acondition.class)
	public Address Address5() {
		System.out.println("����ע�⡣��������������������������������");
		
		Address address = new Address("�����Ƽ�","������");
		return address;	
	}

}
