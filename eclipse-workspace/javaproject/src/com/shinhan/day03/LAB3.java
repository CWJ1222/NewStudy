package com.shinhan.day03;

import java.util.Scanner;

public class LAB3 {
	static Scanner sc;

//args 명령행 매개변수
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		q1(args[0]);
		//q2();
		sc.close();
	}

	private static void q2() {
		System.out.println(abs(10, 20));
		System.out.println(abs(20, 10));
	}

	private static int abs(int i, int j) {
		int result = i - j;
		return result < 0 ? result * -1 : result;

	}

	private static void q1(String month) {
		// String -> int
		int mon = Integer.parseInt(month);
		printSeason(mon);
	}

	private static void printSeason(int month) {
		String message = "";
		switch (month) {
		case 12, 1, 2 -> {
			message = "겨울";
		}
		case 3, 4, 5 -> {
			message = "봄";
		}
		case 6, 7, 8 -> {
			message = "여름";
		}
		case 9, 10, 11 -> {
			message = "가을";
		}
		default -> {
			message = "월 오류";
		}
		}
		System.out.println(message + "에 태어나셨네요.");

	}
}
