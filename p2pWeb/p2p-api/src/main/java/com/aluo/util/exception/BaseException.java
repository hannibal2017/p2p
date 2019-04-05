package com.aluo.util.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseException extends RuntimeException implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private List<ExceptionCause> causeList = new ArrayList();

	public BaseException() {
	}

	public BaseException(String message) {
		super(message);
	}

	public void addCause(ExceptionCause exceptionCause) {
		this.causeList.add(exceptionCause);
	}

	public List<ExceptionCause> getCauseList() {
		return this.causeList;
	}
}