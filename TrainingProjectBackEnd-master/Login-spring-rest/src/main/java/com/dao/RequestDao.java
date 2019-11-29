package com.dao;

import java.util.List;

import com.model.RequestModel;

public interface RequestDao {
	public boolean addRequest(RequestModel rqst);

//	public boolean updateService(ServiceModel svc);
	public boolean deleteRequest(String rqstName);

	public RequestModel findRequestByName(String rqstName);
	public RequestModel findRequestById(String rqstName);
	

	public List<RequestModel> getAllRequests();

	public boolean isRequestExistsByName(String rqstName);
	public boolean isRequestExistsById(String id);
}
