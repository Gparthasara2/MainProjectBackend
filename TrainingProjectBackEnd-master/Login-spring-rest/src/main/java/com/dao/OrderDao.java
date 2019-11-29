package com.dao;

import java.util.List;

import com.model.OrderModel;

public interface OrderDao {

	public boolean addOrder(OrderModel ordr);

//	public boolean updateService(ServiceModel svc);
	public boolean deleteOrder(String ordrName);

	public OrderModel findOrder(String ordrName);

	public List<OrderModel> getAllOrders();

	public boolean isOrderExists(String ordrName);
}
