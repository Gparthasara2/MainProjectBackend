package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ServiceProvider {

	@Id
	private String userID;
	private String username;
	private String firstName;
	private String lastName;
	private String emailId;
	private String companyName;
	private String password;
	private List<String> svcNames = new ArrayList<>();
	private List<String> rqstNames = new ArrayList<>();
	private List<String> acceptedRqsts = new ArrayList<>();
	private List<String> orders = new ArrayList<>();

	
	public List<String> getSvcNames() {
		return svcNames;
	}

	public void setSvcNames(List<String> svcNames) {
		this.svcNames = svcNames;
	}

	public List<String> getRqstNames() {
		return rqstNames;
	}

	public void setRqstNames(List<String> rqstNames) {
		this.rqstNames = rqstNames;
	}

	public ServiceProvider() {

	}

	public ServiceProvider(String userID, String username, String firstName, String lastName, String emailId,
			String password) {
		super();
		this.userID = userID;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public List<String> getSvcs() {
		return svcNames;
	}

	public void setSvcs(List<String> svcs) {
		this.svcNames = svcs;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", password=" + password + "]";
	}

	public List<String> getAcceptedRqsts() {
		return acceptedRqsts;
	}

	public void setAcceptedRqsts(List<String> acceptedRqsts) {
		this.acceptedRqsts = acceptedRqsts;
	}

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
//		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
//		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		result = prime * result + userID;
//
//		result = prime * result + ((username == null) ? 0 : username.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		ServiceProvider other = (ServiceProvider) obj;
//		if (emailId == null) {
//			if (other.emailId != null)
//				return false;
//		} else if (!emailId.equals(other.emailId))
//			return false;
//		if (firstName == null) {
//			if (other.firstName != null)
//				return false;
//		} else if (!firstName.equals(other.firstName))
//			return false;
//		if (lastName == null) {
//			if (other.lastName != null)
//				return false;
//		} else if (!lastName.equals(other.lastName))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		if (userID != other.userID)
//			return false;
//
//		if (username == null) {
//			if (other.username != null)
//				return false;
//		} else if (!username.equals(other.username))
//			return false;
//		return true;
//	}

}