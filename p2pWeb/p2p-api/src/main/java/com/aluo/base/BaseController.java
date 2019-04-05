package com.aluo.base;
	
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {

	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;

		this.response = response;

		this.session = request.getSession();
	}

	public HttpServletRequest getRequest() {
		return this.request;
	}

	public HttpSession getSession() {
		return this.session;
	}

	public void printJson(String str) {
		HttpServletResponse response = this.response;
		try {
			response.setContentType("text/html;charset=UTF-8");
			response.setCharacterEncoding("utf-8");
			PrintWriter writer = response.getWriter();
			writer.write(str);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
