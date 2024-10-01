package com.shinhan.day04;

public class Phonetest {

	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone("갤럭시10");
		Phone p3 = new Phone("갤럭시11", "삼성");
		Phone p4 = new Phone("아이폰11", "에플", 100);

		p1.print();
		p2.print();
		p3.print();
		p4.print();

	}
}