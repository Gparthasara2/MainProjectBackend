package com.dao;

import java.util.List;

import com.model.ServiceProvider;

public interface UserDao {
	
	public boolean addUser(ServiceProvider user);
	public boolean updateUser(ServiceProvider user);
	public boolean deleteUser(String username);
	public ServiceProvider findUserByName(String username);

	public ServiceProvider findUserByMailId(String mail);
public ServiceProvider findUserById(String username);
	public List<ServiceProvider> getAllUsers();
	public boolean isUserExistsByName(String username);
	public boolean isUserExistsById(String username);

	public boolean isUserExistsByMailId(String mail);

	public boolean validateUser(String username,String password);

}
