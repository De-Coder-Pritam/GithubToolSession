package in.pritam.bean;



import org.hibernate.Session;
import org.hibernate.Transaction;

import in.pritam.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Transaction transaction = session.beginTransaction();
		ProgrammerProjectInfo info = new ProgrammerProjectInfo();
		info.setPname("Pritam");
		info.setProjName("JAVA");
		ProgramProjId id = new ProgramProjId();
		id.setPid(23);
		id.setProjId(234);
		info.setId(id);
		session.saveOrUpdate(info);
		transaction.commit();
		
	}

}
