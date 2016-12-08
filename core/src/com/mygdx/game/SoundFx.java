package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundFx {

	Sound 	sound_1,
			sound_2,
			sound_3,
			sound_4,
			sound_5,
			sound_6,
			sound_7,
			sound_8,
			sound_9,
			sound_10,
			sound_11,
			sound_12,
			sound_13,
			sound_14,
			sound_15,
			sound_16;
	
	public SoundFx() {
		sound_1 = Gdx.audio.newSound(Gdx.files.internal("sound_1.mp3"));
		sound_2 = Gdx.audio.newSound(Gdx.files.internal("cat.mp3"));
		sound_3 = Gdx.audio.newSound(Gdx.files.internal("sound_3.mp3"));
		sound_4 = Gdx.audio.newSound(Gdx.files.internal("sound_4.mp3"));
	}

	public void playWithSwitch() {
		if (TestApp.switchOutput == 1) {
			muteAll();
			playSound_1();
		} else if (TestApp.switchOutput == 2) {
			muteAll();
			playSound_2();
		} else if (TestApp.switchOutput == 3) {
			muteAll();
			playSound_3();
		} else if (TestApp.switchOutput == 4) {
			muteAll();
			playSound_4();
		} else if (TestApp.switchOutput == 5) {
			muteAll();
			playSound_5();
		} else if (TestApp.switchOutput == 6) {
			muteAll();
			playSound_6();
		} else if (TestApp.switchOutput == 7) {
			muteAll();
			playSound_7();
		} else if (TestApp.switchOutput == 8) {
			muteAll();
			playSound_8();
		} else if (TestApp.switchOutput == 9) {
			muteAll();
			playSound_9();
		} else if (TestApp.switchOutput == 10) {
			muteAll();
			playSound_10();
		} else if (TestApp.switchOutput == 11) {
			muteAll();
			playSound_11();
		} else if (TestApp.switchOutput == 12) {
			muteAll();
			playSound_12();
		} else if (TestApp.switchOutput == 13) {
			muteAll();
			playSound_13();
		} else if (TestApp.switchOutput == 14) {
			muteAll();
			playSound_14();
		} else if (TestApp.switchOutput == 15) {
			muteAll();
			playSound_15();
		} else if (TestApp.switchOutput == 16) {
			muteAll();
			playSound_16();
		}
	}
	
	private void muteAll() {
		sound_1.stop();
		sound_2.stop();
		sound_3.stop();
		sound_4.stop();
		sound_5.stop();
		sound_6.stop();
		sound_7.stop();
		sound_8.stop();
		sound_9.stop();
		sound_10.stop();
		sound_11.stop();
		sound_12.stop();
		sound_13.stop();
		sound_14.stop();
		sound_15.stop();
		sound_16.stop();
	}
	
	public void playSound_1() {
		sound_1.play();
		sound_1.loop();
	}
	
	public void stopSound_1() {
		sound_1.stop();
	}
	
	public void playSound_2() {
		sound_2.play();
		sound_2.loop();
	}
	
	public void stopSound_2() {
		sound_2.stop();
	}
	
	public void playSound_3() {
		sound_3.play();
		sound_3.loop();
	}
	
	public void stopSound_3() {
		sound_3.stop();
	}
	
	public void playSound_4() {
		sound_4.play();
		sound_4.loop();
	}
	
	public void stopSound_4() {
		sound_4.stop();
	}
	
	public void playSound_5() {
		sound_5.play();
		sound_5.loop();
	}
	
	public void stopSound_5() {
		sound_5.stop();
	}
	
	public void playSound_6() {
		sound_6.play();
		sound_6.loop();
	}
	
	public void stopSound_6() {
		sound_6.stop();
	}
	
	public void playSound_7() {
		sound_7.play();
		sound_7.loop();
	}
	
	public void stopSound_7() {
		sound_7.stop();
	}
	
	public void playSound_8() {
		sound_8.play();
		sound_8.loop();
	}
	
	public void stopSound_8() {
		sound_8.stop();
	}
	
	public void playSound_9() {
		sound_9.play();
		sound_9.loop();
	}
	
	public void stopSound_9() {
		sound_9.stop();
	}
	
	public void playSound_10() {
		sound_10.play();
		sound_10.loop();
	}
	
	public void stopSound_10() {
		sound_10.stop();
	}
	
	public void playSound_11() {
		sound_11.play();
		sound_11.loop();
	}
	
	public void stopSound_11() {
		sound_11.stop();
	}
	
	public void playSound_12() {
		sound_12.play();
		sound_12.loop();
	}
	
	public void stopSound_12() {
		sound_12.stop();
	}
	
	public void playSound_13() {
		sound_13.play();
		sound_13.loop();
	}
	
	public void stopSound_13() {
		sound_13.stop();
	}
	
	public void playSound_14() {
		sound_14.play();
		sound_14.loop();
	}
	
	public void stopSound_14() {
		sound_14.stop();
	}
	
	public void playSound_15() {
		sound_15.play();
		sound_15.loop();
	}
	
	public void stopSound_15() {
		sound_15.stop();
	}
	
	public void playSound_16() {
		sound_16.play();
		sound_16.loop();
	}
	
	public void stopSound_16() {
		sound_16.stop();
	}
}
