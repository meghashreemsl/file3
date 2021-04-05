package com.wolken.wolkenapp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.AirportBean;
public class Util {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
		AirportBean bean = applicationContext.getBean(AirportBean.class);
		bean.airport();
		System.out.println(bean);
	}

}
