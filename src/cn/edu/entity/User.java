package cn.edu.entity;

import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 4316726651354348583L;
	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String icon;
	private Integer state;
	private String gender;
	private Date createDate;
	private Date updateDate;
	private String description;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String password, String phone, Integer state, Date createDate, Date updateDate) {
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.state = state;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	/** full constructor */
	public User(String name, String password, String phone, String icon, Integer state, String gender, Date createDate,
			Date updateDate, String description) {
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.icon = icon;
		this.state = state;
		this.gender = gender;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", icon=" + icon
				+ ", state=" + state + ", gender=" + gender + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", description=" + description + "]";
	}

}