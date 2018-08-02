package cn.edu.entity;

/**
 * ViewStatistic entity. @author MyEclipse Persistence Tools
 */

public class ViewStatistic implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -3759832852895610602L;
	private Integer id;
	private Integer newsId;
	private String newsTitle;
	private String publisher;
	private Integer count;

	// Constructors

	/** default constructor */
	public ViewStatistic() {
	}

	/** full constructor */
	public ViewStatistic(Integer newsId, String newsTitle, String publisher, Integer count) {
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.publisher = publisher;
		this.count = count;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return this.newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}