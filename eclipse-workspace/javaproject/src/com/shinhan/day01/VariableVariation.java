package com.shinhan.day01;

public class VariableVariation {
	// static변수 class의 모든 메서드에서 공유한다.
	static int score = 300; // static이 없으면 메모리에 안올라온다.

	public static void main(String[] args) {
		System.out.println("class 변수접근 " + score); // static이 있어야 읽을 수 있음
		// 메서드 내의 변수는 지역변수이다. 메서드 종료 시 제거된다.
		int score = 100;
		method1();
		method2();
		System.out.println("main에서 출력 " + score);
		System.out.println("main에서 출력 " + VariableVariation.score);
	}

	private static void method2() {
		String grade = "A학점";
		int score = 85;
		String title="!!!!";
		if (score < 90) {
			//String title = "!!!!!";
			grade = "B학점";
		}
		//System.out.println(title + "당신의 점수는 " + score + "학점은 " + grade); //title은 범위 벗어났으므로 쓸수 없
		System.out.println(title + "당신의 점수는 " + score + "학점은 " + grade); 
		//title을 넣고 싶다면 if,else 모두에 경우를 넣어서 초기화를 하거나 아예 밖에서 초기화를 해야한다.
		//변수는 반드시 초기화 후 사용해야 
	}

	private static void method1() {
		int score = 200;
		System.out.println("method1에서출력 " + score);
		System.out.println("method1에서 출력 " + VariableVariation.score);

	} // 함수를 부르고 나서 함수가 지워진다.

}
