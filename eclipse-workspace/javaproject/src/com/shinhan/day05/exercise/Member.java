package com.shinhan.day05.exercise;

//VO(value objecrt)값 저장을 위한 목적이다.
//DTO(data transfer object) : data전달
public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member (String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Member (String name, String id, int age) {
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
