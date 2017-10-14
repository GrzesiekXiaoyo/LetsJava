package com.company.SpringWIthoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContext
{
	@Bean(name = "order")
	public Order getOrder()
	{
		Order order = new Order(22);
		order.setSaver(new SaveToDataBase());

		return order;
	}
}
