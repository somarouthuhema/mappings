package org.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojos.Address;
import com.techouts.hibernate.pojos.Employee;

public class Client {
   public static void main(String[] args)
   {
	   Configuration cg=new Configuration();
		cg.configure("hibernate.cfg.xml");
		SessionFactory sf=cg.buildSessionFactory();
		Session s=sf.openSession();
	    Transaction t=s.beginTransaction();  
	    
	    Employee e1=new Employee();
	    e1.setEmployeeId(5);
	    e1.setName("hema");    
	    e1.setEmail("hema@gmail.com");    
	        
	    Address address1=new Address();  
	    address1.setAddressLine1("pragathi nagar");    
	    address1.setCity("bhadrachalam");    
	    address1.setState("telangana");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    address1.setEmployee(e1);    
	        
	    s.save(e1);    
	    t.commit();    
	        
	    s.close();    

	   
   }
}
