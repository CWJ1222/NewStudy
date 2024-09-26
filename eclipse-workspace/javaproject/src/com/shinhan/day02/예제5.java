package com.shinhan.day02;

public class 예제5 {

	public static void main(String[] args) {
		call1();
	}

	private static void call1() {
		int x, y;
		for (x = 1; x <= 10; x += 1) {
			for (y = 1; y <= 10; y += 1)

				if (4 * x + 5 * y == 60)
					System.out.println("x=" + x + "\ty=" + y);

		}
	}

}
