package com.shinhan.day05;

//DTO Data Transfer Object - 데이터를 이동 시 사용하는 객체.
//VO Value Objet - 값을 저장하기 위해 만들어 놓은 상태(로직이 없는 상태)
//c언어의 structure 와 비슷, 데이터를 저장하기 위한 것.
//field+constructor+getter/setter
public class Book {
	private String title;
	private int price;

	// 우클릭-sourece-constructor field
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
