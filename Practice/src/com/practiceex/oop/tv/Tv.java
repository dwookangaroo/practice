package com.practiceex.oop.tv;

public class Tv {
	// 필드
	private int channel; //초기값7
	private int volume; //20
	private boolean power; //false
	// 생성자
	public Tv(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	// 기본생성자 오버로딩
	public Tv(){
		
	}
	// 게터 생성
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	//세터
	public void setChannel(int channel) {
		if(channel > 255) {
			this.channel = 255;
			return;
		}else if(channel < 0) {
			this.channel = 0;
			return;
		}else {
		this.channel = channel;
		}
	}
	public void setVolume(int volume) {
		if(volume > 100) {
			this.volume = 100;
			return;
		}else if(volume < 0) {
			this.volume = 0;
			return;
		}else {
			this.volume = volume;
		}
		
	}

	
	//메서드
	public void power(boolean on) {
		if(on) {
			System.out.println("티비를 켰습니다"); //여기서 return을 안해줘도
			this.power = true;					// 초기값이 변하네?
		}else {									// setter도 return안해줘도 되나
			System.out.println("티비를 껏습니다");
			this.power = false;
		}
		
	}
	public void channel(int channel) {
		System.out.println("채널: " + channel);
		this.channel = channel;
	}
	public void channel(boolean up) {
		if(up == true) {
			channel ++;
			this.channel = channel;
		}else {
			channel --;
			this.channel = channel;
		}
		System.out.println("채널 "+ channel);
	}
	public void volume(int volume) {
		System.out.println("볼륨: " + volume);  //여기서 setVolume()과
												//그냥 볼륨의 차이
		this.volume = volume;
		
	}
	public void volume(boolean up) {
		if(up == true) {
			volume++;
			this.volume = volume;
		}else {
			volume--;
			this.volume = volume;
		}
		System.out.println("볼륨: " + volume);
	}
	public void status() {
		System.out.printf("티비는 %s, 볼륨은 %d, 채널은 %d%n",
				power,volume,channel);
	}	
	
	
}
