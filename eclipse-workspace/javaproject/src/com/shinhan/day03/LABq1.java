package com.shinhan.day03;

import java.util.Scanner;

public class LABq1 {

	public static void main(String[] args) {
		call();
	}

	private static void call() {
		Scanner sc = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요 : ");
		int start = sc.nextInt();
		System.out.print("마지막을 정수로 입력하세요 : ");
		int end = sc.nextInt();
		System.out.print("증가을 정수로 입력하세요 : ");
		int step = sc.nextInt();
		int total = 0;

		for (int job = start; job <= end; job += step) {
			total += job;
		}
		if(total>1000) total +=2000;
		System.out.printf("총합은 %d 입니다.", total);
		sc.close();
	}

}
