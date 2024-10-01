package com.shinhan.day04;

public class Car {

	/*
	 * 
	 * 자동차 car  class정의.

특징 : model color price

기능 : go() back() stop()
class 는 틀, template
들어가는 내용은 순서 상관없음
	 * 
	 * 문장은 아무데나 사용불가, 사용하려면 {}하고 사용해야함.
	 * 
	 */
	
	//1.필드 field : 속성, 변수선언, object들의 공통특성
	String model;
	String color;
	int price;

	
	//생성자 메서드 --정의하지 않으면 컴파일러가 자동으로 만들어줌. 정의가 있으면 자동생성 안됨
	//생성자의 overloading 여러개 있다.(생성하는 방법 다양)
	//overloading 이름은 같고 매개변수가 다르다.
	//값을 초기화 하는 것이 목적이다.
	
	Car(){
		System.out.println("3. Car default 생성자:매개변수없");
	}

	Car(String m, String c, int p){
		model = m;
		color = c;
		price = p;
	}
	
	Car(String m){
		model = m;
//	}
	
	//매개변수이름과 field이름이 충돌
	//구분하기 위해 현재 겍체를 this 사
	//생성자가 여러개인 경우 하나의 생성자가 다른 생성자를 호출
//	Car(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;//필드하고 매개변수 이름이 같다. 잘못 들어감.
		
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;		
	}

	//Car(String model){
//		this(model, null, 0);
	//}
	/*w
	Car(String model, String color){
		this(mode1, color, 500);	
	}
	*/
	
	
	void go(){
		System.out.println("직진");
	}




	void back(){
		System.out.println("후진");
	}
	void stop(){
		System.out.println("정지");
	}
	
	{
		System.out.println("instance block");
	}
	static
	{
		System.out.println("instance block");
	}
	
	
}

