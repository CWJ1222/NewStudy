package com.shinhan.day04;

import java.util.Scanner;

//class : Object만들기 위한 틀, ~template, 붕어빵틀 
//객체(Object) : class로 만든 독립된 개체, 특징과 행위를 갖는다.

public class ObjectTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println(a == b); //객체 두개는 다르다. 
		
		String s1 = new String("java"); // new부분이 힙 메모리
		String s2 = new String("java"); // 
	}

}
