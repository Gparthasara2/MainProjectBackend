package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.RequestModel;

@Repository
public class RequestDaoImpl implements RequestDao {

	@Autowired
	private MongoTemplate mongotemplate;

	@Override
	public boolean addRequest(RequestModel rqst) {
		System.out.println("Saving the service with details " + rqst);
		mongotemplate.save(rqst);

		return true;
	}

//	@Override
//	public boolean updateService(ServiceModel svc) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	@Override
	public boolean deleteRequest(String rqstName) {
		// TODO Auto-generated method stub
		RequestModel r = this.findRequestByName(rqstName);
		return mongotemplate.remove(r).wasAcknowledged();
	}

	@Override
	public RequestModel findRequestByName(String rqstName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(rqstName));
		List<RequestModel> list = mongotemplate.find(query, RequestModel.class);
		return list.get(0); // to return only 1 user
	}
	
	@Override
	public RequestModel findRequestById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		List<RequestModel> list = mongotemplate.find(query, RequestModel.class);
		return list.get(0); // to return only 1 user
	}

	@Override
	public List<RequestModel> getAllRequests() {

		return mongotemplate.findAll(RequestModel.class);
	}

	@Override
	public boolean isRequestExistsByName(String rqstName) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(rqstName));
		List<RequestModel> list = mongotemplate.find(query, RequestModel.class);

		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	@Override
	public boolean isRequestExistsById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		List<RequestModel> list = mongotemplate.find(query, RequestModel.class);

		if (list.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

}
