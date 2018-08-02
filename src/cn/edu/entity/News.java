package cn.edu.entity;

import java.util.Date;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 5229138628172294427L;
	private Integer id;
	private String title;
	private String subtitle;
	private String icon;
	private String content;
	private String type;
	private String publisher;
	private Integer state;
	private Date createDate;
	private Date updateDate;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(String title, String content, String type, String publisher, Integer state, Date createDate,
			Date updateDate) {
		this.title = title;
		this.content = content;
		this.type = type;
		this.publisher = publisher;
		this.state = state;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	/** full constructor */
	public News(String title, String subtitle, String icon, String content, String type, String publisher,
			Integer state, Date createDate, Date updateDate) {
		this.title = title;
		this.subtitle = subtitle;
		this.icon = icon;
		this.content = content;
		this.type = type;
		this.publisher = publisher;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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