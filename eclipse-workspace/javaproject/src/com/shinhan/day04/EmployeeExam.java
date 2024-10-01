package com.shinhan.day04;

public class EmployeeExam {

	public static void main(String[] args) {
		// 비슷한 데이터가 반복되면 배열사용하는 것이 좋다.
		Employee[] arr = new Employee[4];
		// Employee emp1 = new Employee("이부장", "부장", 1500000);
		// Employee emp2 = new Employee("김과장", "과장", 1300000);
		// Employee emp3 = new Employee("최대리", "대리", 1200000);
		// Employee emp4 = new Employee("박사원", "사원", 1000000);

		arr[0] = new Employee("이부장", "부장", 1500000);
		arr[1] = new Employee("김과장", "과장", 1300000);
		arr[2] = new Employee("최대리", "대리", 1200000);
		arr[3] = new Employee("박사원", "사원", 1000000);

		for (Employee emp : arr) {
			emp.print();
		}

		// emp1.print();
		// emp2.print();
		// emp3.print();
		// emp4.print();
	}

}
