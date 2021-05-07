package com.practiceex.oop.tv;

public class TvApp {

	public static void main(String[] args) {
		Tv tv= new Tv(7, 21, false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
	}

}
