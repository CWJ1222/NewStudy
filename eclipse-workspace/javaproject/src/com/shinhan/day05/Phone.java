package com.shinhan.day05;





//final:최종임, 변경불가
//사용되는 경우.
//1.field 에 사용하면 값변경불가
//2.method 에 사용하면 재정의 불가
//3.class 에 사용하면 상속 불가
public class Phone {

	String model;
	int price;
	// final 값을 할당 후 수정불가 : instance 변수이므 선언시, 생성시
	public final String company = "aa";
	final String company2;
	// 선언시 초기화 필수(상수), 관례상 이름은 대문자로 사용.
	final static String COMPANY3 = "cc";

	public Phone() {
		company2 = "bb";
	}

	// 접근제한자 test
	//pubic > protected > 생략(default)>private
	//모든패키지는 모든 class에서 접근가
	public int a = 10;
	//같은 패키지는 모든 class 접근가능, 다른패키지면 상속 받아야 가능
	protected int b = 20;
	//deafult modifier 생략, 같은 패키지만 접근가능
	int c = 30;
	// private: class 내부에서만 접근 가능
	private int d = 40;

	void test() {
		System.out.println(a + b + c + d);
		print1();
		print2();
		print3();
		print4();
	}

	public void print1() {
		System.out.println("phone class의 public method");
	}

	protected void print2() {
		System.out.println("phone class의 protected method");
	}

	void print3() {
		System.out.println("phone class의 default method");
	}

	private void print4() {
		System.out.println("phone class의 private method");
	}

}
