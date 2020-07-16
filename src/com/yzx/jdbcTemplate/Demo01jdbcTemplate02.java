package com.yzx.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.yzx.bean.User;
import com.yzx.druid.jdbcutils;

public class Demo01jdbcTemplate02 {
	public static void main(String[] args) {
		//addUser1();
		 //updateUser();
		 //deleteUser();
		//deleteUser1();
		//findUserById1();
		findUserById();

	}
	//��ѯ����
	public static void findUserById() {
		JdbcTemplate jt = new JdbcTemplate(jdbcutils.getDataSource());
		String sql = " SELECT *from person";
		List<User> list = jt.query(sql, new BeanPropertyRowMapper<User>(
				User.class));

		for (User user : list) {
			System.out.println(user);
		}
	}
	
	
	
	//���
	 public static void addUser1(){ JdbcTemplate jt1 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 String sql1 = "insert into person values" +
	 "( '2','��� ','db','1205','21','ѧ��db','170')," +
	 "( '3','����','ww','1827','24','��ʦww','180')," +
	  "( '4','����','zs','0505','20','����zs','175')," +
	  "( '5','����','ls','0708','16','У��lisi','165');"; 
	 int update =jt1.update(sql1); System.out.println(update); }
	// �޸�
	
	  public static void updateUser(){ JdbcTemplate jt2 = new
	  JdbcTemplate(jdbcutils.getDataSource());
	  
	  int update = jt2.update("update person set name=? where id=?","Ҧ־��",3);
	  System.out.println(update); }
	
	// idɾ��
	
	 public static void deleteUser(){ JdbcTemplate jt3 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 int update = jt3.update("delete from person where id=?",4);
	 System.out.println(update); }
	
	//����ɾ��
	 public static void deleteUser1(){ JdbcTemplate jt4 = new
	 JdbcTemplate(jdbcutils.getDataSource());
	 
	 String sql4 ="delete from person where name='����'"; int delete =
	 jt4.update(sql4); System.out.println(delete); }
	 
	//��������
	public static void findUserById1() {
		JdbcTemplate jt5 = new JdbcTemplate(jdbcutils.getDataSource());
		String sql5 = " SELECT *from person where id='2'";
		List<User> list = jt5.query(sql5, new BeanPropertyRowMapper<User>(
				User.class));

		for (User user : list) {
			System.out.println(user);
		}
	}
}
