package cn.edu.action;

import cn.edu.component.Page;
import cn.edu.component.Result;
import cn.edu.entity.User;
import cn.edu.exception.MyException;
import cn.edu.service.IUserService;

public class UserAction {

	private IUserService userService;
	private Result<Object> response;
	private Page<User> page;
	private User user;
	private String id;

	public Result<Object> getResponse() {
		return response;
	}

	public void setResponse(Result<Object> response) {
		this.response = response;
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Page<User> getPage() {
		return page;
	}

	public void setPage(Page<User> page) {
		this.page = page;
	}

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public String save() throws Exception {
		try {
			System.out.println(user);
			//添加用户
			response= userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage("添加用户失败！" + e.getMessage());
			throw new MyException();
		}
		return "success";
	}

	/**
	 * 编辑用户时获取用户信息
	 * @return
	 * @throws Exception
	 */
	public String edit() throws Exception {
		try {
			//获取用户id
			Integer userId = Integer.valueOf(id);
			//查找用户
			response = userService.findUserById(userId);		
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage("查找用户失败！" + e.getMessage());
			throw new MyException();
		}
		return "success";
	}
	
	/**
	 * 分页查找用户
	 * @return 
	 * @throws Exception
	 */
	public String queryNormal() throws Exception {
		try {
			response = userService.findNormalUsers(page);
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatus(false);
			response.setMessage("获取用户列表失败！" + e.getMessage());
			throw new MyException();
		}
		return "success";
	}
	
	public String execute() throws Exception {
		return "success";
	}


}
