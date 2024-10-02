package com.shinhan.day05;

//
public class SingleTone {
	// private static SingleTone single = new SingleTone();
	static SingleTone single;

	private SingleTone() {

	}

	public static SingleTone getInstance() {
		if (single == null)
			single = new SingleTone();
		return single;
	}

}
