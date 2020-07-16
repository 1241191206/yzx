package com.yzx.druid;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class Demoyzx_01 {
	public static void main(String[] args) throws Exception {
		Properties pro = new Properties();
		InputStream resourceAsStream = Demoyzx_01.class.getClassLoader().getResourceAsStream("jdbc.pro");
		
		pro.load(resourceAsStream);
		
		
		String property= pro.getProperty("name");
		String password = pro.getProperty("psaaword");

		System.out.println(property);
		System.out.println(password);

		DataSource datasource = DruidDataSourceFactory.createDataSource(pro);

		System.out.println(datasource.getConnection());

		Connection connection = datasource.getConnection();
		
		System.out.println("获得的连接"+connection);

		Statement createStatement = connection.createStatement();

		String sql = "select * from student";

		ResultSet rs = createStatement.executeQuery(sql);

		while (rs.next()) {
			String name = rs.getString("Sno");
			String no = rs.getString("SName");
			String pno = rs.getString("SSex");
			System.out.println(name+no+pno);
		}
		//createStatement.close();
		connection.close();
	}
}