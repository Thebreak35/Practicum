package com.mygdx.game;

public class Button_1 extends Button{
	public static boolean[] isClick = new boolean[17];
	public static SoundFx soundfx = new SoundFx();
	private int soundNumber;
	
	public void resetButton_1() {
		for(int i = 0 ; i < 17 ; i++) {
			isClick[i] = false;
		}
	}
	
	public void changeState(int inp) {
		System.out.println(isClick[inp]);
		isClick[inp] = !isClick[inp];
	}
	
	public void setSound(int inp) {
		soundNumber = inp;
	}
	
	public void play() {
		if (soundNumber == 1) {
			soundfx.playSound_1();
		} else if (soundNumber == 2) {
			soundfx.playSound_2();
		} else if (soundNumber == 3) {
			
		} else if (soundNumber == 4) {
			
		} else if (soundNumber == 5) {
			
		} else if (soundNumber == 6) {
			
		} else if (soundNumber == 7) {
			
		} else if (soundNumber == 8) {
			
		} else if (soundNumber == 9) {
			
		} else if (soundNumber == 10) {
			
		} else if (soundNumber == 11) {
			
		} else if (soundNumber == 12) {
			
		} else if (soundNumber == 13) {
			
		} else if (soundNumber == 14) {
			
		} else if (soundNumber == 15) {
			
		} else if (soundNumber == 16) {
			
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
