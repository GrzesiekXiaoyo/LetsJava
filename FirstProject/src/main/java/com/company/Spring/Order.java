package com.company.Spring;

public class Order implements ISave
{
	private int OrderId;
	private ISave saver;

	public Order(int orderId)
	{
		OrderId = orderId;
	}

	public int getOrderId()
	{
		return OrderId;
	}

	public void setSaver(ISave saver)
	{
		this.saver = saver;
	}

	@Override
	public void Save()
	{
		saver.Save();
	}
}
