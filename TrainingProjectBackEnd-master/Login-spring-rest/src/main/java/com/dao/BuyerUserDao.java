package com.dao;

import java.util.List;

import com.model.UserBuyer;

public interface BuyerUserDao {
	public boolean addUser(UserBuyer user);
	public boolean updateUser(UserBuyer user);
	public boolean deleteUser(String username);
	public UserBuyer findUserByName(String username);
	public UserBuyer findUserById(String id);
	public List<UserBuyer> getAllUsers();
	public UserBuyer findUserByEmailId(String id);
	public boolean isUserExistsByName(String username);
	
	public boolean isUserExistsById(String username);
	public boolean isUserExistsByEmailId(String username);
	public boolean validateUser(String username,String password);

}
