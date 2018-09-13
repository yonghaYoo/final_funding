package com.funding.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.funding.domain.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
							Object handler, ModelAndView modelAndView)throws Exception{
		HttpSession session = request.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object MemberVO = modelMap.get("member");
		System.out.println("aa");
		System.out.println(modelMap.get("member"));
		
		if(MemberVO != null){
			session.setAttribute("member", MemberVO);
			System.out.println("oo");
			
			
			Object dest = session.getAttribute("dest");
			response.sendRedirect(dest != null ? (String)dest:"/main");
			System.out.println("bb");
			System.out.println(session.getAttribute("dest"));
		}
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
							Object handler)throws Exception{
		HttpSession session = request.getSession();
		System.out.println("cc");
		
		if(session.getAttribute("member") != null){
			session.removeAttribute("member");
			System.out.println("dd");
		}
		return true;
	}

}
