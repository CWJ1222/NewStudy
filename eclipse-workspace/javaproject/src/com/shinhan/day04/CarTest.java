package com.shinhan.day04;

public class CarTest {

	public static void main(String[] args) {
		f1();

	}

	private static void f1() {
		Car c1, c2=new Car("B모델", "red", 6000); //생성 시 field가 자동초기화된다.
		// ▲ 생성하면서 초기화해버리는게 낫다
		
		Car c3 = new Car("C모델");
		Car c4 = new Car("D모델","block");
		
		c1 = new Car();
	//	c1.model ="A모델"; 데이터를 직접 이렇게 입력하는 것은 좋지 않다.
	//	c1.color = "white";
	//	c1.price = 5000;
		System.out.println(c1.model+"-"+c1.color+"-"+c1.price);
		System.out.println(c2.model+"-"+c2.color+"-"+c2.price);
		System.out.println(c3.model+"-"+c3.color+"-"+c3.price);
		
	}

}
