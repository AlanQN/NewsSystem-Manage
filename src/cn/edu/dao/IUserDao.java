package cn.edu.dao;

import java.util.List;

import cn.edu.component.Page;
import cn.edu.entity.User;

public interface IUserDao {

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public boolean insert(User user);
	
	/**
	 * 根据主键id查找用户
	 * @param id
	 * @return
	 */
	public User findById(Integer id);
	
	/**
	 * 分页查找用户
	 * @return
	 */
	public List<User> findNormalUsers(Page<User> page);
	
	/**
	 * 获得正常用户的总数
	 * @return
	 */
	public Integer getNormalTotalNum();
	
}
