package cn.edu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.component.Page;
import cn.edu.dao.IUserDao;
import cn.edu.entity.User;

@Transactional
public class UserDaoImpl implements IUserDao {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * 添加用户	
	 */
	@Override
	public boolean insert(User user) {
		//获取会话
		Session session = getSession();
		//添加用户
		session.save(user);
		return true;
	}

	/**
	 * 根据主键id查找用户
	 * @param id
	 * @return
	 */
	public User findById(Integer id) {
		Session session = getSession();
		User user = (User) session.get(User.class, id);
		return user;
	}

	/**
	 * 查找正常用户
	 */
	@Override
	public List<User> findNormalUsers(Page<User> page) {
		//获取session
		Session session = getSession();
		//查询正常用户的sql语句
		String sql = "select id, name, phone, gender, state, create_date, update_date from user where state !=2";
		//创建Query对象
		Query query = session.createSQLQuery(sql);
		//设置查询最大记录数
		query.setMaxResults(page.getPageSize());
		//设置查询起点
		query.setFirstResult(page.getStartIndex());
		//查询用户
		List<User> users = query.list();
		return users;
	}

	/**
	 * 获取正常用户的总数
	 */
	@Override
	public Integer getNormalTotalNum() {
		//获取会话
		Session session = getSession();
		//查询正常用户总数的sql语句
		String sql = "select count(*) from user where state != 2";
		//创建Query对象
		Query query = session.createSQLQuery(sql);
		//查询正常用户总数
		Integer totalNum = Integer.parseInt(query.uniqueResult().toString());
		return totalNum;
	}

}
