package com.thd.springboottest.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[]{"com.thd.springboottest.bean.color.Color",
				"com.thd.springboottest.bean.animal.Dog"};
	}

}
