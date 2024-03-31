package com.example.springbasic;

import com.example.springbasic.ch01.AppConfig;
import com.example.springbasic.ch01.MyBean;
import com.example.springbasic.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
		//ApplicationContext context = SpringApplication.run(SpringBasicApplication.class, args);

		// ApplicationContext에서 빈 가져오기
		/*
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			Object bean = context.getBean(beanDefinitionName);
			System.out.println("name: " + beanDefinitionName + ", object: " + bean);
		}
		*/

	}
}
