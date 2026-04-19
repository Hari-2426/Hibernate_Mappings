package com.connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetoone.Aadhar;
import com.onetoone.Citizen;

public class HibernateConnection {
	
	
	public static SessionFactory sf=null;
	public static SessionFactory getSessionFactory()
	{
		if(sf==null)
		{
			Configuration cf=new Configuration();
			cf.configure();
			cf.addAnnotatedClass(Citizen.class);
			cf.addAnnotatedClass(Aadhar.class);
			sf=cf.buildSessionFactory();
			return sf;
		}
		else return sf;
	}

}
