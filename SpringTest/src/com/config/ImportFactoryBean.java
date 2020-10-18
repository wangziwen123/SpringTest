package com.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ImportFactoryBean implements ImportBeanDefinitionRegistrar{
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		// TODO Auto-generated method stub
		ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry);
		
		registry.registerBeanDefinition("student5", BeanDefinitionBuilder.rootBeanDefinition("com.entity.Student").getBeanDefinition());
		registry.registerBeanDefinition("students", BeanDefinitionBuilder.rootBeanDefinition("com.entity.Students").getBeanDefinition());
	}
}
