package com.shinhan.day05.exercise;

public class MemberService {

	boolean login(Member member) {
		if(member.id.equals("hong")&&member.password.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
