package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.OrderModel;

@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired
	private MongoTemplate mongotemplate;

	@Override
	public boolean addOrder(OrderModel ordr) {
		System.out.println("Saving the service with details " + ordr);
		mongotemplate.save(ordr);

		return true;
	}

//	@Override
//	public boolean updateService(ServiceModel svc) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean deleteOrder(String id) {
		// TODO Auto-generated method stub
		OrderModel o = this.findOrder(id);
		return mongotemplate.remove(o).wasAcknowledged();
	}

	@Override
	public OrderModel findOrder(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		List<OrderModel> list = mongotemplate.find(query, OrderModel.class);
		return list.get(0); // to return only 1 user
	}

	@Override
	public List<OrderModel> getAllOrders() {

		return mongotemplate.findAll(OrderModel.class);
	}

	@Override
	public boolean isOrderExists(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		List<OrderModel> list = mongotemplate.find(query, OrderModel.class);

		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

}
