package com.practiceex.oop.tv;

public class TvApp {

	public static void main(String[] args) {
		Tv tv = new Tv(7, 20, false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(130);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(false);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		
		

	}

}
