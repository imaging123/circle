package com.circle.web.member;

import com.circle.entity.member.User;
import com.circle.service.member.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2015/11/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = userService.getUserByUsernameAndPassword(username, password);
		request.getSession().setAttribute("user", user);
		request.setAttribute("user", user);

		return new ModelAndView("success");
	}

}
