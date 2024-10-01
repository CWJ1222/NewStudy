package com.shinhan.day04;

public class Employee {
//field 멤버변수, static변
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

//생성자 만들기. new하는 방식 : 값을 초기화하는 것이 목적
	public Employee(String name, String title, int baseSalary) {

		this.name = name;
		this.title = title + "님";
		this.baseSalary = baseSalary;
		getTotalSalary();
	}

//3. 일반메서
	public void getTotalSalary() {
//		switch{
//		case : title=="부장" -> {totalSalary = baseSalary * 0.25}
//		case : title=="과장" -> {}
//		default -> {};

//		}
//문자열 비교 시 == 말고 equals를 사용해아한다.
		if (title.equals("부장님")) {
			totalSalary = (int) (baseSalary + baseSalary * 0.25);
		} else if (title.equals("과장님")) {
			totalSalary = (int) (baseSalary + baseSalary * 0.15);
		} else {
			totalSalary = (int) (baseSalary + baseSalary * 0.05);
		}
	}

	public void print() {
		getTotalSalary();
		System.out.printf("%s직급의 %s씨의 본봉은 %d원이고 총급여는 %d원 입니다.\n", title, name, baseSalary, totalSalary);
	}
}
