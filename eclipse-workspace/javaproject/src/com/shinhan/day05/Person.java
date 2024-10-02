package com.shinhan.day05;

public class Person {
	//field : instance변수, class 변
	int numberOfPersons;
	int age;
	String name;

	public Person() {
		this(12, "Anonymous");
	}

	pulic Person(int age, String name) {

		this.name = name;
		this.age = age;
		numberOfPersons++;

	}

	void selfIntroduce(string name, int age) {
		System.out.prinln("내 이름은 "
				+ name 
				+"이며, 나이는 "
				+ age
				+ "살 입니다.");
	}

	static int getPopulation(){
			return numberOfPersons;
	}
	
	public static void main(String[] args) {
		
	
	Person p1 = new Person();
	Person p2 = new Person(20,"홍길동");
	systemout (p1.getPopulation()+"명");
	systemout p2.getPopulation();
	systemout p2.getPopulation();
	System.out.println(Person.getPopulation()+"명");
	}
}

