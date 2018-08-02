package cn.edu.entity;

import java.util.Date;

/**
 * Publisher entity. @author MyEclipse Persistence Tools
 */

public class Publisher implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -4805389944307613480L;
	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String icon;
	private String description;
	private Integer state;
	private Date createDate;
	private Date updateDate;

	// Constructors

	/** default constructor */
	public Publisher() {
	}

	/** minimal constructor */
	public Publisher(String name, String password, Integer state, Date createDate, Date updateDate) {
		this.name = name;
		this.password = password;
		this.state = state;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	/** full constructor */
	public Publisher(String name, String password, String phone, String icon, String description, Integer state,
			Date createDate, Date updateDate) {
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.icon = icon;
		this.description = description;
		this.state = state;
		this.createDate = createDate;
		this.updateDate = updateDate;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
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

}