package Coding;

import java.lang.reflect.Array;

public class 오장8번 {

	public static void main(String[] args) {
//		f1();
		f2();
	}

	private static void f2() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;

		System.out.println("총점은 :" + sum);
		System.out.println("평균은 :" + avg);

	}

	private static void f1() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int total = 0;
		int cnt = 0;

		for (int[] datas : array) {
			for (int data : datas) {
				cnt++;
				total += data;
			}
		}
		System.out.println("총점은 :" + total);
		System.out.println("평균은 :" + (double) total / cnt);
	}

}
