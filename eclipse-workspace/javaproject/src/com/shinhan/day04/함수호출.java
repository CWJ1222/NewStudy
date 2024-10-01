package com.shinhan.day04;

public class 함수호출 {

	public static void main(String[] args) {
/*System.out.println("hello main");
	}
	public void f2() {
		System.out.println("Hello f2");
*/		
		//f3();

	}
	private void f3() {
//데이터 타입
		//기본형 byte short char int long float double boolean(1바이트)
		//참조형 class enum interface, ....
		int [] arr = {10,20,30};// new int[] 생략가능
	//	arr = new int[] {10,20,30};
		
for(int i=0;i<arr.length;i++) { //length() ()가 있으면 함수이다.
System.out.println(arr[i]);
}
		
	}

//public이 붙어 있는 것에 .java를 해야 함
	//
	
}
