package com.mygdx.game;

public class Button_1 extends Button{
	public static boolean isClick = false;
	public static SoundFx soundfx = new SoundFx();
	private int soundNumber;
	
	public void changeState() {
		isClick = !isClick;
	}
	
	public void setSound(int inp) {
		soundNumber = inp;
	}
	
	public void play() {
		if (soundNumber == 1) {
			soundfx.playSound_1();
		} else if (soundNumber == 2) {
			soundfx.playSound_2();
		}
	}
	
	public void stop() {
		if(soundNumber == 1) {
			soundfx.stopSound_1();
		} else if (soundNumber == 2) {
			soundfx.stopSound_2();
		}
	}
}
