package com.etc.util;


import java.util.List;

/**
 * 分页数据类
 * @param <T>
 */
public class PageData<T> {
	private List<T> data; // 查找的数据

	private Integer total; // 总记录数

	private Integer pageSize;// 每页几行

	private Integer page;// 第几页页数
	
	private Integer toTalPage;

	public PageData() {
		super();
	}

	public PageData(List<T> data, Integer total, Integer pageSize, Integer page) {
		super();
		this.data = data;
		this.total = total;
		this.pageSize = pageSize;
		this.page = page;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public int getTotalPage() {
		//		20(条)/5(行)=4(页)
		int num = total / pageSize; 
		//如果总记录数除页数的记录不余零,那么就增加一页
		if (total % pageSize != 0)
			num++;
		return num;
	}

	@Override
	public String toString() {
		return "{total:" + total + ",data:" + data + "}";
	}
}
