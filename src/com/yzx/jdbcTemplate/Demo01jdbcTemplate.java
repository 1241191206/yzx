package com.yzx.jdbcTemplate;

import java.util.List;

import com.yzx.bean.User;
import com.yzx.dao.UserDao;
import com.yzx.dao.UserDaoImpl;

public class Demo01jdbcTemplate {
	public static void main(String[] args) {
		UserDao ud =new UserDaoImpl();
		List<User>list=ud.findAllUser();
		for (User user : list) {
			System.out.println(user);
		}
	}
}
