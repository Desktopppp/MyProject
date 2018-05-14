package com.itheima.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;

public interface OrdersDao {

	@Select("select * from orders")
	@Results({
		@Result(property="product", column="productid", javaType=Product.class,
				one=@One(select="com.itheima.dao.ProductDao.findById"))
	})
	public List<Orders> findAll();
}
