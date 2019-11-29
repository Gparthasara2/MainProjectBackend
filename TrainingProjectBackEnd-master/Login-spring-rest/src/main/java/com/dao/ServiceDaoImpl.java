package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.ServiceModel;

@Repository
public class ServiceDaoImpl implements ServiceDao{

	@Autowired
	private MongoTemplate mongotemplate;
	
	@Override
	public boolean addService(ServiceModel svc) {
		System.out.println("Saving the service with details "+ svc );
		mongotemplate.save(svc);
		
		return true;
	}

//	@Override
//	public boolean updateService(ServiceModel svc) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean deleteService(String svcName) {
		// TODO Auto-generated method stub
		ServiceModel s = this.findService(svcName);
		return mongotemplate.remove(s).wasAcknowledged();
	}

	@Override
	public ServiceModel findService(String svcName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("svcName").is(svcName));
		List<ServiceModel> list = mongotemplate.find(query, ServiceModel.class);
		return list.get(0) ; //to return only 1 user
	}

	@Override
	public List<ServiceModel> getAllServices() {
		
		return mongotemplate.findAll(ServiceModel.class);
	}

	
	@Override
	public boolean isServiceExists(String svcName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("svcName").is(svcName));
		List<ServiceModel> list = mongotemplate.find(query, ServiceModel.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}

}
