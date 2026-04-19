package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.connections.HibernateConnection;

public class OneToOne {
	
	
	public static void main(String[] args) {
		
		SessionFactory sf=HibernateConnection.getSessionFactory();
		Session s=sf.openSession();
		
//		inserting(s);
		findingDataByCitizen(s);
//		Aadhar aadhar = s.find(Aadhar.class, 889977456123L);
//		System.out.println(aadhar.toString());
//		System.out.println(aadhar.getCitizen());
		
	}

	private static void findingDataByCitizen(Session s) {
		Citizen citizen = s.find(Citizen.class,1 );
		System.out.println(citizen.toString());
	}

	private static void inserting(Session s) {
		Aadhar aadhar1=new Aadhar(889977456123L,"Nandu");
		Citizen c=new Citizen(1,"Nandan",20,aadhar1);
		s.beginTransaction();
		s.persist(c);
		System.out.println("Data inserted successfully!!!!");
		s.getTransaction().commit();
		s.close();
	}

}
