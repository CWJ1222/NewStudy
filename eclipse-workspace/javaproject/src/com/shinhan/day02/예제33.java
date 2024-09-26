package com.shinhan.day02;

public class 예제33 {

	public static void main(String[] args) {
		call1();
	}

	private static void call1() {
		int sum = 0;
for(int i =1; i<=100 ; i++ ) {
	if(i%3 == 0)
	{
		sum = sum + i;
				
	}
}
		System.out.println(sum);
	
	}

}
