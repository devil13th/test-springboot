package com.thd.springboottest.service;

import org.springframework.stereotype.Component;

@Component
public class MathService {
	public int add(int a,int b){
		return  a+b;
	}
	
	public int div(int a,int b){
		return  a/b;
	}
}
