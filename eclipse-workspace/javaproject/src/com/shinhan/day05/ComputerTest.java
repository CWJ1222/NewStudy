package com.shinhan.day05;

public class ComputerTest {

	public static void main(String[] args) {
//		f1();
//		f2();
		f3();
	}

	private static void f3() {
		Computer c1 = new Computer("ddddd", "mac",1000);
	//	System.out.println(c3.productName);
	//	System.out.println(c3.os);
	//	System.out.println(c3.price);
		c1.infoPrint();
	}
/*
	private static void f2() {
		Computer c2 = new Computer("ddddddddddd", "MAC", 300);
		System.out.println(c2.getProductName());
		System.out.println(c2.getOs());
		System.out.println(c2.getPrice());
	}

	private static void f1() {
		// 기본형이었다면 선언 후 초기화 후 사용하면 됨
		int a;
		a = 10;
		++a;
		System.out.println(a);
		// 객체 참조변수를 선언
		Computer c1;
		// 객체생성
		c1 = new Computer();
		// 객체사용
		c1.setProductName("내컴퓨터");
		c1.setOs("window10");
		c1.setPrice(200);
		// 하나하나 초기화하기 불편
		System.out.println(c1);
		System.out.println(c1.productName);
		System.out.println(c1.os);
		System.out.println(c1.price);
	}
	*/

}
