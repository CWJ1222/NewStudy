package Coding;

public class 오장6번 {

	public static void main(String[] args) {
//		f1();
		f2();

	}

	private static void f2() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length); // 2차원 : 1차원이 1차원임을 강조
		System.out.println(array[2].length);
		for (int[] datas : array) {
			for (int data : datas) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
	}

	private static void f1() {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length);
		System.out.println(array[2].length);
	}

}
