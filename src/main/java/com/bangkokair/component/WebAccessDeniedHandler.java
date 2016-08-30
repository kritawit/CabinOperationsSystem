package com.bangkokair.component;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class WebAccessDeniedHandler implements AccessDeniedHandler {

	private String errorPage;

	public WebAccessDeniedHandler(String errorPage) {
		this.errorPage = errorPage;
	}

	public String getErrorPage() {
		return errorPage;
	}

	public void setErrorPage(String errorPage) {
		this.errorPage = errorPage;
	}

	public void handle(HttpServletRequest request, HttpServletResponse respone, AccessDeniedException e)
			throws IOException, ServletException {
		respone.sendRedirect(errorPage);
	}

}
