package com.practiceex.oop.song;

public class SongApp {

	public static void main(String[] args) {
		Song iu = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		
		Song bb = new Song("BIGBANG", "거짓말", "Always", 2007, 2, "GDRAGON");
		
		Song bubu = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
		
		iu.showInfo();
		bb.showInfo();
		bubu.showInfo();
	}
	
		
	
}
