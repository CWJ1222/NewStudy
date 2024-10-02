package Coding;

import java.util.Scanner;

public class 오장9번 {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Scanner sc = new Scanner(System.in);
		menuDisplaay();

		boolean isLoop = true;
		int studentCount = 0;
		int[] score = null;

		while (isLoop) {
			System.out.println("선택>>");
			int jobSelect = sc.nextInt();

			switch (jobSelect) {
			case 1 -> {
				studentCount = f_insertCount(sc);
				score = new int[studentCount];
			}
			case 2 -> {
				f_insertScore(sc, score);
			}
			case 3 -> {
				f_printScore(score);
			}
			case 4 -> {
				f_display(score);
			}
			case 5 -> {
				isLoop = false;
			}
			default -> {
				System.out.println("다시 선택하세요.");
			}
			}
		}

	}

	private static void f_display(int[] score) {

		int total = 0;
		int max = Integer.MIN_VALUE;
		for (int data : score) {
			total += data;
			max = data > max ? data : max;

		}
		System.out.println("최고점 : " + max);
		System.out.println("평균점 : " + 1.0 * total / score.length);
	}

	private static void f_printScore(int[] score) {
		if (!f_countcheck(score))
			return;
		for (int i = 0; i < score.length; i++) {
			System.out.printf("scores[%d]:%d\n", i, score[i]);
		}
	}

	private static void f_insertScore(Scanner sc, int[] score) {
		if (!f_countcheck(score))
			return;
		for (int i = 0; i < score.length; i++) {
			System.out.printf("scores [%d]>", i);
			score[i] = sc.nextInt();
		}
	}

	private static boolean f_countcheck(int[] score) {
		if (score == null) {
			System.out.println("학생 수 먼저 입력하세요.");
			return false;
		}
		return true;
	}

	private static int f_insertCount(Scanner sc2) {
		System.out.println("학생수>>");
		return sc2.nextInt();
	}

	private static void menuDisplaay() {
		System.out.println("----------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
		System.out.println("----------------------------------------------------");
	}

}
