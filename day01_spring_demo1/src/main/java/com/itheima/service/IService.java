package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.domain.Account;
public interface IService {
	List<Account> findAll() throws SQLException;
	boolean insert(Account acc) throws SQLException;
	void transfer(String src,String target,double money);
}
