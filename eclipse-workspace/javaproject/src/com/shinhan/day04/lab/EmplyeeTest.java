package com.shinhan.day04.lab;

public class EmplyeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee("123", "홍길동", 1000);
		System.out.println(emp.getSalary(0.1));
		
		//주소출력 패키지이름.class이름@hashcode
		//toString의 출력
		//모든 상속은 object, 
		//오브젝트 클래스의 toString()메서드 구현되어 있다.
		//객체출력시 자동으로 toString메서도 호출된다.
		//재정의 가능(override) 이름같고 매개변수 같고 returntype같고 접근지정자는 같거나 더 넓어져야 한다.
		
		//public > protected > 생략 > private
		//public : 모든 패키지에서 접근 가능
		//protected 같은 패키지면 접근가능, 다른패키지면 상속받으면 가능
		//생략 ~ 같은 패키지에서만 접근가능
		//private 같은 class에서만 접근
		
		
		System.out.println(emp);
		System.out.println(emp.toString());
		
	}

}
