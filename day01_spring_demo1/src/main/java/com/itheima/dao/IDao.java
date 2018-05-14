package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import com.itheima.domain.Account;
import com.itheima.domain.User;

public interface IDao {
	 List<Account> findAll() throws SQLException;
	 boolean insert(Account acc) throws SQLException;
}
