package cn.edu.service;

import cn.edu.component.Page;
import cn.edu.component.Result;
import cn.edu.entity.User;

public interface IUserService {
	
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Result<Object> addUser(User user);
	
	/**
	 * 根据主键id查找用户
	 * @param id
	 * @return
	 */
	public Result<Object> findUserById(Integer id);
	
	/**
	 * 分页查找用户
	 * @param page
	 * @return
	 */
	public Result<Object> findNormalUsers(Page<User> page);

}
