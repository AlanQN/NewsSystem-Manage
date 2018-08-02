package cn.edu.entity;

/**
 * NewsType entity. @author MyEclipse Persistence Tools
 */

public class NewsType implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = -734107315588131757L;
	private Integer id;
	private String name;

	// Constructors

	/** default constructor */
	public NewsType() {
	}

	/** full constructor */
	public NewsType(String name) {
		this.name = name;
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

}