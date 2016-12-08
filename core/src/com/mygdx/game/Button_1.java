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
//		System.out.println(isClick[inp]);
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
			soundfx.playSound_3();
		} else if (soundNumber == 4) {
			soundfx.playSound_4();
		} else if (soundNumber == 5) {
			soundfx.playSound_5();
		} else if (soundNumber == 6) {
			soundfx.playSound_6();
		} else if (soundNumber == 7) {
			soundfx.playSound_7();
		} else if (soundNumber == 8) {
			soundfx.playSound_8();
		} else if (soundNumber == 9) {
			soundfx.playSound_9();
		} else if (soundNumber == 10) {
			soundfx.playSound_10();
		} else if (soundNumber == 11) {
			soundfx.playSound_11();
		} else if (soundNumber == 12) {
			soundfx.playSound_12();
		} else if (soundNumber == 13) {
			soundfx.playSound_13();
		} else if (soundNumber == 14) {
			soundfx.playSound_14();
		} else if (soundNumber == 15) {
			soundfx.playSound_15();
		} else if (soundNumber == 16) {
			soundfx.playSound_16();
		}
	}
	
	public void stop() {
		if(soundNumber == 1) {
			soundfx.stopSound_1();
		} else if (soundNumber == 2) {
			soundfx.stopSound_2();
		} else if (soundNumber == 3) {
			soundfx.stopSound_3();
		} else if (soundNumber == 4) {
			soundfx.stopSound_4();
		} else if (soundNumber == 5) {
			soundfx.stopSound_5();
		} else if (soundNumber == 6) {
			soundfx.stopSound_6();
		} else if (soundNumber == 7) {
			soundfx.stopSound_7();
		} else if (soundNumber == 8) {
			soundfx.stopSound_8();
		} else if (soundNumber == 9) {
			soundfx.stopSound_9();
		} else if (soundNumber == 10) {
			soundfx.stopSound_10();
		} else if (soundNumber == 11) {
			soundfx.stopSound_11();
		} else if (soundNumber == 12) {
			soundfx.stopSound_12();
		} else if (soundNumber == 13) {
			soundfx.stopSound_13();
		} else if (soundNumber == 14) {
			soundfx.stopSound_14();
		} else if (soundNumber == 15) {
			soundfx.stopSound_15();
		} else if (soundNumber == 16) {
			soundfx.stopSound_16();
		}
	}
}
