package com.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @import�ڶ��ַ�ʽʵ��ע�룬ʵ��ImportSelector�ӿ�
 * @author WangZH
 *
 */
public class ImportBeanImpl implements ImportSelector{
	
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[]{"com.entity.Student","com.entity.Students"} ;
	}
	

}
