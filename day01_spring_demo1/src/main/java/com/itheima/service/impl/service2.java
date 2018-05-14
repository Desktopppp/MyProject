package com.itheima.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import com.itheima.dao.IDao;
import com.itheima.domain.Account;
import com.itheima.service.IService;

public class service2 implements IService{
	@Resource(name="daoimpl")		//去上下文中寻找 id 为daoimpl的 bean 为其赋值
	private IDao dao;

	@Override
	public List<Account> findAll() throws SQLException {
		return dao.findAll();
	}

	@Override
	public boolean insert(Account acc) throws SQLException {
		return dao.insert(acc);
	}

	@Override
	public void transfer(String src, String target, double money) {
		// TODO Auto-generated method stub
		
	}

/*	@Override
	public void transfer(String src, String target, double money) {
		Connection con =null;
		try {
		    con = Transaction.getConnection();
		    con.setAutoCommit(true);
			Account srcname=dao.findByName(src);
			Account tarname=dao.findByName(target);
			if(srcname==null ||tarname==null) {
				con.rollback();
				return;
			}
			boolean f1 = dao.updateMoney(srcname,money,con);
			boolean f2 = dao.updateMoney(tarname,money,con);
			if(f1&&f2) {
				con.commit();
			}else {
				con.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.setAutoCommit(false);
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}*/


}
