package com.cx.dada.common;

import org.springframework.context.ApplicationContext;

public class SpringContextUtil {

	 private static ApplicationContext applicationContext;

	  public static void setApplicationContext(ApplicationContext context) {
	       applicationContext = context;
	  }
	  
	   public static Object getBean(String beanId) {
	    return applicationContext.getBean(beanId);
	  }

	  public static <T> T getBean(Class<T> clazz){
		  return applicationContext.getBean(clazz);
	  }
}
