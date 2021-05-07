package com.practiceex.oop.tv;

public class Tv {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
		
	}
	//메서드
	public void power(boolean power) {
		String message = new String("티비가 ");
		if(power) {
			message += "켜졌습니다";
		}else {
			message += "꺼졌습니다";
		}
		System.out.println(message);
	}
	public void channel(int channel) {
		
	}
	public void channel(boolean up) {
		
	}
	public void volume(int volume) {
		System.out.printf("볼륨은 %2d 입니다%n", this.volume);
	}
	public void volume(boolean up) {
		
	}
	
	//getter
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	//setter
	public void setVolume(int volume) {
		
		if(volume > 100) {
			this.volume = 100;
			return;
		} else {
			this.volume = volume;
		}
	}
	
	// 메서드
	public void status() {
		power(power);
		System.out.printf("볼륨은 %d, 채널은 %d번입니다%n",
				 volume, channel);
		
	}
}
