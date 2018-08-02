package cn.edu.service.impl;

import java.util.Date;
import java.util.List;

import cn.edu.component.Page;
import cn.edu.component.Result;
import cn.edu.dao.IUserDao;
import cn.edu.entity.User;
import cn.edu.service.IUserService;

public class UserServiceImpl implements IUserService {

	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * 添加用户
	 */
	@Override
	public Result<Object> addUser(User user) {
		//设置创建时间和更新时间
		user.setCreateDate(new Date());
		user.setUpdateDate(new Date());
		//添加用户
		boolean result = userDao.insert(user);
		//封装结果
		Result<Object> response = new Result<Object>();
		response.setStatus(result);
		if (!result) {
			response.setMessage("添加用户失败！");
		}
		return response;
	}

	/**
	 * 根据主键id查找用户
	 */
	@Override
	public Result<Object> findUserById(Integer id) {
		//查找用户
		User user = userDao.findById(id);
		//封装结果
		Result<Object> response = new Result<Object>();
		response.setData(user);
		if (user == null) {
			response.setStatus(false);
			response.setMessage("用户不存在！");
		} else {
			response.setStatus(true);
		}
		return response;
	}

	@Override
	public Result<Object> findNormalUsers(Page<User> page) {
		//获取正常用户总数
		Integer totalNum = userDao.getNormalTotalNum();
		//设置总页数、总记录数等信息
		int totalPage = (int) Math.ceil(totalNum / page.getPageSize());
		int startIndex = page.getPageSize() * (page.getPageNum() - 1);
		page.setStartIndex(startIndex);
		page.setTotalRecord(totalNum);
		page.setTotalPage(totalPage);
		//查找用户
		List<User> users = userDao.findNormalUsers(page);
		page.setData(users);
		//封装结果
		Result<Object> response = new Result<Object>();
		response.setStatus(true);
		response.setData(users);
		return response;
	}

}
