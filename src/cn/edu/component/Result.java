package cn.edu.component;

/**
 * 处理结果对象
 * @param <T>
 */

public class Result<T> {
	
	private Boolean status;	//处理结果
	private String message;	//出错信息
	private T data;	//数据
	
	public Result() {
		
	}
	
	public Result(Boolean status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
