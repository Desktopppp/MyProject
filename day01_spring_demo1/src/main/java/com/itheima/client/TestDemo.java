package com.itheima.client;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.dao.IDao;
import com.itheima.domain.Account;
import com.itheima.service.IService;

public class TestDemo {
	@SuppressWarnings("all")
	@Test
	public void findAll() {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		IService sv = app.getBean("servieimpl",IService.class);
		try {
			List<Account> findAll = sv.findAll();
			for(Account ac:findAll) {
				System.out.println(ac);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void insert() {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
		IService sv = app.getBean("servieimpl",IService.class);
		Account bean = app.getBean("account",Account.class);
		bean.setMoney(1998.0);
		bean.setName("fff");
		try {
			if(sv.insert(bean)) {
				System.out.println("success");
			}else {
				System.out.println("error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
