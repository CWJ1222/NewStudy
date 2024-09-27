package com.shinhan.day03;

import java.util.Scanner;

public class LABq5 {

	public static void main(String[] args) {
call();
	}

	private static void call() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각역삼각형을 출력할 줄 수 : ");
		int su = sc.nextInt();
		for (int row = 1; row <= su;row++) {
			for(int col=1;col<=su+1-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
