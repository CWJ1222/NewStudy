package com.shinhan.day04;

public class Korean {
	
	//1. field : 변수(값저장)
	private String nation="대한민국";
	private String name; //new 하면 null이 만들어
	private String ssn;
	
	
	//2. constructor 생성자 만들어준다. 우클릭 - source - generate constructor
	public Korean(String name, String ssn) {
		super();//안하는 게 보통. extends처리해주는 것.
		this.name = name;
		this.ssn = ssn;
	}

//우클릭 - source - getters setters
	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	/*String getNation() {
		return nation;
	}
	
	void setNation(String nation){
		this.nation = nation;
	}
	
	*/
	
	
	
	
	//get, set 변수이름 으로 주로 쓴다.
	
//	Korean(String name, String ssn){
	//	this.name = name;
	//	this.ssn = ssn;
		
//	}
	
	
	
	
	
}
