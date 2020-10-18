package com.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @import第二种方式实现注入，实现ImportSelector接口
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
