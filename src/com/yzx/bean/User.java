package com.yzx.bean;

public class User {
	 private Integer id;
	 private Integer age;
	 private String name;
	 private String username;
	 private String password;
	 private String desc;
	 private Double height;
	 
	 public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name
				+ ", username=" + username + ", password=" + password
				+ ", desc=" + desc + ", height=" + height + "]";
	}
}
