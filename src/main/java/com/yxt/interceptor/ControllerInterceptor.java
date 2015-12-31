package com.yxt.interceptor;


import com.sumscope.tag.aop.IAOPCallback;

public class ControllerInterceptor implements IAOPCallback{

	@Override
	public boolean before(Object obj, Object[] args) {
		return true;
	}

	@Override
	public void after(Object obj, Object[] args) {
		
	}

}
