package com.shinhan.day04;

import java.util.Calendar;
import java.util.Scanner;

public class EnumTest {

	static final int MONDAY = 1; // 상수는 이 위치에, 상수는 대문자, 자바초기에는 상수를 이렇게 사용함
	static final int SUCCESS = 1; // 상수를 분리하지 않으면 이런 경우 실행오류(1이 어떤 걸 입력했는지 모르기 때문에)

	public static void main(String[] args) {
		// f1();
//		f2();
		// f3();
		f4();

	}

	private static void f4() {
		// Today's day of week(1~7 Sun~Sat)
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(Calendar.DAY_OF_WEEK);//local 미적용으로 7이 나옴.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		Week today = null;
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		}
		System.out.println(today + "--" + today.name() + "==" + today.ordinal());
	}

	private static void f3() {
		Week[] arr = Week.values();
		for (Week week : arr) {
			System.out.println(week + "==" + week.name() + "--" + week.ordinal());
		}
		Week w = Week.MONDAY;
		System.out.println(w == Week.MONDAY ? "M" : "etc");

	}

	private static void f2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("요일입력(1)>>");
		int su = sc.nextInt();
		System.out.println(su == MONDAY ? "monady" : "etc");
	}

	private static void f1() {
//상수:한번할당 후 수정불가
//예, 원의 넓이 = 반지름 * 반지름 * 3.14(PI)
		int r = 10;
		double area = r * r * Math.PI;

		System.out.println(Math.PI);
		System.out.println(area);
	}

}
