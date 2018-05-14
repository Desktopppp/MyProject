package com.itheima.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.dao.IDao;
import com.itheima.domain.Account;
public class DaoImpl implements IDao{
	private DataSource ds;
	private String abvc;
	public DataSource getDs() {
		return ds;
	}
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<Account> findAll() throws SQLException {
		QueryRunner qr = new QueryRunner(ds);
		return qr.query("select * from account", new BeanListHandler<>(Account.class));
	}

	@Override
	public boolean insert(Account acc) throws SQLException {
		QueryRunner qr=  new QueryRunner(ds);
		int i = qr.update("insert into account values(?,?,?) ",acc.getId(),acc.getName(),acc.getMoney());
		return i==1;
	}
	public void transfer(String src,String target,double money) {		//ת��
		
	}
	
}
