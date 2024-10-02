package com.shinhan.day06;

import com.shinhan.day05.Phone;

public class ModifierTest2 extends Phone{ 
	//extends 로 상속받으면 모두 사용할수 있음 - public
	//
public static void main(String[] args) {
	String s1 = "자바";
	String s2= new String ("자바");
	byte[] bytes = {65,66,67};
	String s3 = new String(bytes);
	System.out.println(s3);
}
	public static void f2(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.bitCount(7));
		
		Integer a= 10;
		Integer b= 20;
		System.out.println(a.compareTo(b));
		
	}
	
	void test() {
		System.out.println(a +b );
		print1();
		print2();

	}

}
