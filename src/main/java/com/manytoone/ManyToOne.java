package com.manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.connections.HibernateConnection;

public class ManyToOne {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateConnection.getSessionFactory();
		Session s=sf.openSession();
		inserting(s);
		retriving(s);
		s.close();
		
	}

	private static void retriving(Session s) {
		User user = s.find(User.class, 102);
		System.out.println(user.toString());
	}

	private static void inserting(Session s) {
		Orders o1=new Orders(156,"Smasung");
		Orders o2=new Orders(168,"LED TV");
		Orders o3=new Orders(111,"Table");
		List<Orders>li=new ArrayList<>();
		li.add(o1);
		li.add(o2);
		li.add(o3);
		User u1=new User(102,"Nandu",li);
		
		s.beginTransaction();
		o1.setUser(u1);
		o2.setUser(u1);
		o3.setUser(u1);
		s.persist(u1);
		System.out.println("Data Inserted Successfully!!!!");
		s.getTransaction().commit();
	}

}
