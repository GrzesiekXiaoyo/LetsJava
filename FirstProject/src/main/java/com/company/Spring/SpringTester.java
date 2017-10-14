package com.company.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester
{
	public static void Test()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/application-context.xml");
		BeanFactory factory = context;

		Order order = (Order)factory.getBean("order");
		//Order order2 = (Order)factory.getBean("order2"); exception bo nie istnieje

		System.out.println(order.getOrderId());
		order.Save();
	}

}
