package cn.edu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class HBUtil {
	
	private static SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		HBUtil.sessionFactory = sessionFactory;
	}
	
	/**
	 * 打开会话
	 * @return
	 */
	public static Session openSession() {
		return sessionFactory.getCurrentSession();
	}

}
