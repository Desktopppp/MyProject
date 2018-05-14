package com.itheima.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.IDao;
import com.itheima.domain.Account;
import com.itheima.service.IService;

public class ServiceImpl implements IService{
	private IDao dao;

	public IDao getDao() { 
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

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
		
		
	}


}
