package com.my.wkts.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//������ �α��� ���� �о���� 
		HttpSession session = request.getSession();
		String logId = (String) session.getAttribute("logId");
		
		//�α��� ���°� �ƴ� ��� �α��� �������� �̵�
//		if ( logId == null ) {
//			response.sendRedirect(request.getContextPath() + "/");
//			return false;
//		}
		
		return true;
	}
}//end::Class