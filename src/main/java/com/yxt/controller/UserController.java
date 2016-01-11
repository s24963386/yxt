package com.yxt.controller;

import java.util.HashMap;
import java.util.Map;

import com.sumscope.tag.rest.annotation.URIAlias;
import com.sumscope.tag.rest.servlet.BaseController;
import com.sumscope.tag.sql.TagJDBCInstance;
import com.sumscope.tag.sql.bean.TagPage;
import com.yxt.dao.T_userDAO;

@URIAlias("user")
public class UserController extends BaseController {
	
	public Map<String,Object> list() throws Exception{
		Map<String,Object> result = new HashMap<String,Object>();
		Map count = TagJDBCInstance.getInstance().queryOne("select count(*) from t_user",null);
		TagPage<T_userDAO> userPage = new TagPage<T_userDAO>(20);
		T_userDAO.dao.findPage("select * from t_user",userPage,new Object[]{});
		result.put("total", userPage.getTotalCount());
		result.put("rows", userPage.getResult());
		return result;
	}
}
