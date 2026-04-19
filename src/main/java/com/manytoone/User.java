package com.manytoone;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	private int userId;
	private String userName;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private  List<Orders> order;
	
	
	
	public User(int userId, String userName, List<Orders> order) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.order = order;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
	public User() {
		super();
	}
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", order=" + order + "]";
	}

	
	
	
	
	
	

}
