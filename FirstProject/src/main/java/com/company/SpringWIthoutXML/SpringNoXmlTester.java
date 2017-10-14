package com.company.SpringWIthoutXML;

import javafx.application.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringNoXmlTester
{
	public static void Test()
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);
		Order order = context.getBean("order", Order.class);

		System.out.println(order.getOrderId());
		order.Save();
	}
}
