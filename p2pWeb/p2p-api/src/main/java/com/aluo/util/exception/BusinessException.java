package com.aluo.util.exception;

/**
 * 公共异常
 * @author libiqi
 *
 */
public class BusinessException extends BaseException {

	private static final long serialVersionUID = 1L;

	public BusinessException() {
	}

	public BusinessException(String messageKey) {
		super(messageKey);
		ExceptionCause cause = new ExceptionCause(messageKey);
		addCause(cause);
	}
}
