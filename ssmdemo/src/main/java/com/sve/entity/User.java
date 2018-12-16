package com.sve.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class User {
	private int id;
	@NotEmpty(message="名字不能为空")
	private String name;
	@NotEmpty(message="密码不能为空")
	private String password;
	@Range(min=1,max=100,message="年龄必须在1-100之间")
	@NotNull(message="年龄不能为空")
	private Integer age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
