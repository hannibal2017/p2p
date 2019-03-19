package com.test.domain;

import java.io.Serializable;
import java.util.List;

public class Grid implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long count;
	private List list;

	public Grid() {
		this.count = Long.valueOf(0L);
		this.list = new java.util.ArrayList();
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public List getList() {
		return this.list;
	}

	public void setList(List list) {
		this.list = list;
	}
}