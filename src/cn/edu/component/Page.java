package cn.edu.component;

import java.util.List;

/**
 * 分页查找数据
 * @param <T>
 */

public class Page<T> {
	
	private Integer pageNum;	//页号
	private Integer pageSize;	//一页中的记录数
	private Integer startIndex;	//起点
	private Integer totalPage;	//总页数
	private Integer totalRecord;	//记录总数
	private Integer recordNum;	//当前页实际包含的记录数
	private List<T> data;	//数据
	
	public Page() {
		
	}

	public Page(Integer pageNum, Integer pageSize, Integer startIndex, Integer totalPage, Integer totalRecord,
			Integer recordNum, List<T> data) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.startIndex = startIndex;
		this.totalPage = totalPage;
		this.totalRecord = totalRecord;
		this.recordNum = recordNum;
		this.data = data;
	}

	public Integer getPageNum() {
		return pageNum;
	}
	
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getRecordNum() {
		return recordNum;
	}

	public void setRecordNum(Integer recordNum) {
		this.recordNum = recordNum;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
