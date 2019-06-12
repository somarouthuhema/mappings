package org.techouts.hibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techouts.hibernate.pojos.Address;
import com.techouts.hibernate.pojos.Student;
import com.techouts.hibernate.pojos.StudentDept;

public class Client2 {
	public static void main(String[] args)
	   {
		   Configuration cg=new Configuration();
			cg.configure("student.cfg.xml");
			SessionFactory sf=cg.buildSessionFactory();
			Session s=sf.openSession();
		    Transaction t=s.beginTransaction(); 
		    Student s1=new Student();
		    s1.setStudentId(1);
		    s1.setName("buddi");
		    s1.setEmail("buddi@gmail.com");
		   StudentDept sd1=new StudentDept();
            sd1.setDepartmentId(101);
            sd1.setDepartment("science");
            s1.setStudentdept(sd1);
            s.save(s1);
            t.commit();    
            s.close();    
            System.out.println("<!----success----!>");    
	   }
}