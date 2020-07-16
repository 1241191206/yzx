package com.yzx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yzx.bean.User;
import com.yzx.druid.jdbcutils;

public class UserDaoImpl implements UserDao{
	
	//private static DataSource jdbcutils;
	JdbcTemplate jt = new JdbcTemplate(jdbcutils.getDataSource());
	@Override
	public List<User> findAllUser() {
		String sql = "select * from person";
		List<User> lsit=jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
		return lsit;
	}
}
