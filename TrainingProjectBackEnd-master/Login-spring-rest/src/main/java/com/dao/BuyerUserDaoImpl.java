package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.model.UserBuyer;

@Repository
public class BuyerUserDaoImpl implements BuyerUserDao {
	
	@Autowired
	private MongoTemplate mongotemplate;
	
	@Override
	public boolean addUser(UserBuyer user) {
		System.out.println("Saving the user with details "+ user );
		mongotemplate.save(user);
		
		return true;
	}

	@Override
	public boolean updateUser(UserBuyer user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		UserBuyer b = this.findUserByName(username);
		return mongotemplate.remove(b).wasAcknowledged();
	}

	@Override
	public UserBuyer findUserByName(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		return list.get(0) ; //to return only 1 user
	}
	
	@Override
	public UserBuyer findUserById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userID").is(id));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		return list.get(0) ; //to return only 1 user
	}
	
	@Override
	public UserBuyer findUserByEmailId(String email) {
		Query query = new Query();
		query.addCriteria(Criteria.where("emailId").is(email));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		return list.get(0) ; //to return only 1 user
	}

	@Override
	public List<UserBuyer> getAllUsers() {
		
		return mongotemplate.findAll(UserBuyer.class);
	}

	@Override
	public boolean validateUser(String username, String password) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		query.addCriteria(Criteria.where("password").is(password));
		List<UserBuyer> list =  mongotemplate.find(query, UserBuyer.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean isUserExistsByName(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public boolean isUserExistsById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userID").is(id));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public boolean isUserExistsByEmailId(String email) {
		Query query = new Query();
		query.addCriteria(Criteria.where("emailId").is(email));
		List<UserBuyer> list = mongotemplate.find(query,UserBuyer.class);
		
		if(list.size()==0) {
			return false;
		}
		else {
			return true;
		}
	}

}
