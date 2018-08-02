package cn.edu.action;

import com.opensymphony.xwork2.ActionContext;

public class HelloAction {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String hello() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		if ("张三".equals(username) && "123456".equals(password)) {
			ctx.put("user", username);
			return "success";
		}
		ctx.put("error", "用户不存在或密码错误！");
		return "error";	
	}
	
}
