package com.shinhan.day05.exercise;

public class Printer {
	// method overloading : 이름같고 매개변수의 사양(갯수, 타입) 다르다. return과는 무관

	void println(int a) {
		System.out.println("int~" + a);
	}

	void println(double a) {
		System.out.println("double~" + a);
	}

	void println(boolean a) {
		System.out.println("boolean~" + a);
	}

/*	void println(String a) {
		System.out.println("string~" + a);
	}
*/
	void println(Object a) {
		System.out.println("object~" + a);
	}
}
