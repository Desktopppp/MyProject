package com.itheima.test;

import javax.annotation.Resource;

public class TestSpring {
	
	private static String name;
	
//	@Resource(name="")
	public  void setName(String names) {
		name=names;
	}
	public static void main(String[] args) {
		TestSpring t=new TestSpring();
		t.setName("123");
		System.out.println(name);
	}

}
