package in.pritam.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.pritam.bean.ProgrammerProjectInfo;


public class HibernateUtil {
	private static SessionFactory sesssionFactory =  null;
	private static Session session = null;
	static {
		if(sesssionFactory == null) {
			sesssionFactory = new Configuration()
					.configure()
					.addAnnotatedClass(ProgrammerProjectInfo.class).buildSessionFactory();
		}
	 
	}
	public static Session getSession() {
		if(sesssionFactory != null) {
			session = sesssionFactory.openSession();
		}
		return session;
	}
	
}
