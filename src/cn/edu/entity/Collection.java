package cn.edu.entity;

import java.util.Date;

/**
 * Collection entity. @author MyEclipse Persistence Tools
 */

public class Collection implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 7233783322758333233L;
	private Integer id;
	private String userName;
	private String newsTitle;
	private Date time;

	// Constructors

	/** default constructor */
	public Collection() {
	}

	/** full constructor */
	public Collection(String userName, String newsTitle, Date time) {
		this.userName = userName;
		this.newsTitle = newsTitle;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}