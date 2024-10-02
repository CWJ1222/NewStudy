//package 정의
package com.shinhan.day05;

//다른패키지의 Employee를 사용하기 위해 import
//import com.shinhan.day04.lab.Employee;
//가져올 게 많으면 *를 쓰면 된다.
import com.shinhan.day04.*;

public class PhoneTest {

	public static void main(String[] args) {

		Employee emp = new Employee("aa", "부장", 1000);
		emp.print();
		//public인 경우에야 가져올수 있다.
		//다른 패키지에 있는 내용을 가져오는 경우 import써야 됨.
		//

		System.out.println(Phone.COMPANY3);
		// 이렇게 변경 불가 Phone.COMPANY3 = "dd";
		Phone p = new Phone();
		System.out.println(p.company);
		System.out.println(p.company2);
		// 수정불가 p.company = "dd";
		// p.company2 = "dd";

		// Integer의 최대값
		// PI값
		// Integer.MAX_VALUE =100; 이렇게 변경불가
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}

}
