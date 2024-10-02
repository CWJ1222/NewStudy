package com.shinhan.day05;

public class Car {
	// field ; instance 멤버변수, static변수
	//instance변수 멤버변
	int gas;
	private int speed;
	//method
	//static 변수, class 변수.객체 생성 없이 사용가능
	static String company="현대자동차"; // 
	
	//static method, non static은 사용불가
	static void print() {
		System.out.println("static method.."+company);
	}
	
	static
	{
		System.out.println("instance block.. class 최초 load시행 시 1번시행, 객체생성시마다 실행");
	}
	{
		System.out.println("instance block.. 객체생성시마다 실행");
	}
	
	//instance method : static사용가
	void setSpeed(int speed){
		System.out.println("===method이용==="+company);
		this.speed = speed;
	}
	int getSpeed() {
		return speed;
		//return this.speed this는 생략가능
	}
}
