package com.manytoone;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	private int orderId;
	private String productName;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	
	private User user;
	
	
	
	public Orders(int orderId, String productName, User user) {
		this.orderId = orderId;
		this.productName = productName;
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Orders(int orderId, String productName) {
		super();
		this.orderId = orderId;
		this.productName = productName;
	}
	public Orders() {
		super();
	}
	@Override
	public String toString() {
	    return "Orders [orderId=" + orderId +
	           ", productName=" + productName + "]";
	}
	
	
	

}
