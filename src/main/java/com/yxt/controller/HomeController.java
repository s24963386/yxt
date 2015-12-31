package com.yxt.controller;


import com.sumscope.tag.TagConst.SESSIONKEY;
import com.sumscope.tag.rest.annotation.URIAlias;
import com.sumscope.tag.rest.servlet.BaseController;
import com.sumscope.tag.util.StrUtil;
import com.yxt.dao.T_userDAO;
import com.yxt.service.UserService;

@URIAlias("home")
public class HomeController extends BaseController {
	
	public String index(){
		return "/views/home/login.jsp";
	}

	public void login() throws Exception
	{
		String username = StrUtil.formatNullStr(request.getParameter("username"));
		String pwd = StrUtil.formatNullStr(request.getParameter("password"));
		T_userDAO user = UserService.getInstance().getUser(username);		
		if(user!=null){
			if(StrUtil.md5(pwd).equalsIgnoreCase(user.getPassword())){
				request.getSession().setAttribute(SESSIONKEY.SESSION_USERNAME,username);
				response.sendRedirect(request.getContextPath()+"/views/home/index.jsp");
				return;
			}else{
				request.getSession().setAttribute("error", "密码错误，请核查！");
			}
		}else{
			request.getSession().setAttribute("error", "不存在这个账户，请核查！");
		}
		request.getRequestDispatcher("/views/home/login.jsp?error=true").forward(request, response);
	}
}
