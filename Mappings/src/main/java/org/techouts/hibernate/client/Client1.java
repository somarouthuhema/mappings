package org.techouts.hibernate.client;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojos.Customer;
import com.techouts.hibernate.pojos.Vendor;

public class Client1 {
	public static void main(String[] args)
	   {
		   Configuration cg=new Configuration();
			cg.configure("hibernate1.cfg.xml");
			SessionFactory sf=cg.buildSessionFactory();
			Session s=sf.openSession();
		    Transaction t=s.beginTransaction();  
		    Customer c1=new Customer();    
		    c1.setcId(2);
		    c1.setcName("hema");
		    c1.setAddress("Bhadrcahalam");
		    Customer c2=new Customer ();    
		    c2.setcId(4); 
		    c2.setcName("sreelekha");
		    c2.setAddress("karnool");
		    ArrayList<Customer> list1=new ArrayList<Customer>();    
		    list1.add(c1);    
		    list1.add(c2);    
		    Vendor v1=new Vendor();
		    v1.setVid(1);
		    v1.setVname("vendor1");
		    s.save(v1);
		    s.save(c1);
		    
		    
		    t.commit();    
		    s.close();    
		    System.out.println("success");
		    
		    
	   
	   }
}
