package com.practiceex.oop.song;

public class Song {
	// 필드 생성
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	//생성자
	public Song(String artist, String title, String album,
			int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	//게터 세터
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d번 트랙, %s 작곡)%n", getArtist(),
				getTitle(), getAlbum(), getYear(), getTrack(), getComposer());
	}
}


