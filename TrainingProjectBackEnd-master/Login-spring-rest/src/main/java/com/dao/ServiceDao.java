package com.dao;

import java.util.List;

import com.model.ServiceModel;

public interface ServiceDao {

	public boolean addService(ServiceModel svc);
//	public boolean updateService(ServiceModel svc);
	public boolean deleteService(String svcName);
	public ServiceModel findService(String svcName);
	public List<ServiceModel> getAllServices();
	public boolean isServiceExists(String svcName);
	
}
