package com.yxt.controller;

import com.sumscope.tag.rest.annotation.URIAlias;
import com.sumscope.tag.rest.servlet.BaseController;

@URIAlias("home")
public class HomeController extends BaseController {
	
	public String index(){
		return "/views/home/login.jsp";
	}

}
