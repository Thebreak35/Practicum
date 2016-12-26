package com.mygdx.game;

import java.util.concurrent.TimeUnit;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundFx {

	static Sound 	sound_1,
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
					sound_16,
					sound_dummy_1,
					sound_dummy_2,
					sound_dummy_3,
					sound_dummy_4,
					sound_dummy_5,
					sound_dummy_6,
					sound_dummy_7,
					sound_dummy_8,
					sound_dummy_9,
					sound_dummy_10,
					sound_dummy_11,
					sound_dummy_12,
					sound_dummy_13,
					sound_dummy_14,
					sound_dummy_15,
					sound_dummy_16;
	
	public static boolean[] isSwitchPress = new boolean[17];
	
	public SoundFx() {
		sound_1 = Gdx.audio.newSound(Gdx.files.internal("sound_4.mp3"));
		sound_2 = Gdx.audio.newSound(Gdx.files.internal("drum_1.mp3"));
		sound_3 = Gdx.audio.newSound(Gdx.files.internal("drum_2.mp3"));
		sound_4 = Gdx.audio.newSound(Gdx.files.internal("pack.mp3"));
		sound_5 = Gdx.audio.newSound(Gdx.files.internal("clap.mp3"));
		sound_6 = Gdx.audio.newSound(Gdx.files.internal("rythm.mp3"));
		sound_7 = Gdx.audio.newSound(Gdx.files.internal("prehook.mp3"));
		sound_8 = Gdx.audio.newSound(Gdx.files.internal("guitar.mp3"));
		sound_9 = Gdx.audio.newSound(Gdx.files.internal("hook.mp3"));
		sound_10 = Gdx.audio.newSound(Gdx.files.internal("cat.mp3"));
		sound_11 = Gdx.audio.newSound(Gdx.files.internal("sound_3.mp3"));
		sound_12 = Gdx.audio.newSound(Gdx.files.internal("sound_2.mp3"));
		sound_13 = Gdx.audio.newSound(Gdx.files.internal("sound_1.mp3"));
		sound_14 = Gdx.audio.newSound(Gdx.files.internal("drum_1.mp3"));
		sound_15 = Gdx.audio.newSound(Gdx.files.internal("drum_2.mp3"));
		sound_16 = Gdx.audio.newSound(Gdx.files.internal("clap.mp3"));
		sound_dummy_1 = Gdx.audio.newSound(Gdx.files.internal("sound_4.mp3"));
		sound_dummy_2 = Gdx.audio.newSound(Gdx.files.internal("drum_1.mp3"));
		sound_dummy_3 = Gdx.audio.newSound(Gdx.files.internal("drum_2.mp3"));
		sound_dummy_4 = Gdx.audio.newSound(Gdx.files.internal("pack.mp3"));
		sound_dummy_5 = Gdx.audio.newSound(Gdx.files.internal("clap.mp3"));
		sound_dummy_6 = Gdx.audio.newSound(Gdx.files.internal("rythm.mp3"));
		sound_dummy_7 = Gdx.audio.newSound(Gdx.files.internal("prehook.mp3"));
		sound_dummy_8 = Gdx.audio.newSound(Gdx.files.internal("guitar.mp3"));
		sound_dummy_9 = Gdx.audio.newSound(Gdx.files.internal("hook.mp3"));
		sound_dummy_10 = Gdx.audio.newSound(Gdx.files.internal("cat.mp3"));
		sound_dummy_11 = Gdx.audio.newSound(Gdx.files.internal("sound_3.mp3"));
		sound_dummy_12 = Gdx.audio.newSound(Gdx.files.internal("sound_2.mp3"));
		sound_dummy_13 = Gdx.audio.newSound(Gdx.files.internal("sound_1.mp3"));
		sound_dummy_14 = Gdx.audio.newSound(Gdx.files.internal("drum_1.mp3"));
		sound_dummy_15 = Gdx.audio.newSound(Gdx.files.internal("drum_2.mp3"));
		sound_dummy_16 = Gdx.audio.newSound(Gdx.files.internal("clap.mp3"));
		for (int i = 0 ; i < 17 ; i ++) {
			isSwitchPress[i] = false;
		}
	}

	public static void alwaysCheckSound(int inp) {
		if (inp == 1) {
			sound_1 = sendDummy(Button_1.soundNumber);
		} else if (inp == 2) {
			sound_2 = sendDummy(Button_1.soundNumber);
		} else if (inp == 3) {
			sound_3 = sendDummy(Button_1.soundNumber);
		} else if (inp == 4) {
			sound_4 = sendDummy(Button_1.soundNumber);
		} else if (inp == 5) {
			sound_5 = sendDummy(Button_1.soundNumber);
		} else if (inp == 6) {
			sound_6 = sendDummy(Button_1.soundNumber);
		} else if (inp == 7) {
			sound_7 = sendDummy(Button_1.soundNumber);
		} else if (inp == 8) {
			sound_8 = sendDummy(Button_1.soundNumber);
		} else if (inp == 9) {
			sound_9 = sendDummy(Button_1.soundNumber);
		} else if (inp == 10) {
			sound_10 = sendDummy(Button_1.soundNumber);
		} else if (inp == 11) {
			sound_11 = sendDummy(Button_1.soundNumber);
		} else if (inp == 12) {
			sound_12 = sendDummy(Button_1.soundNumber);
		} else if (inp == 13) {
			sound_13 = sendDummy(Button_1.soundNumber);
		} else if (inp == 14) {
			sound_14 = sendDummy(Button_1.soundNumber);
		} else if (inp == 15) {
			sound_15 = sendDummy(Button_1.soundNumber);
		} else if (inp == 16) {
			sound_16 = sendDummy(Button_1.soundNumber);
		}
	} 
	
	public static Sound sendDummy(int s) {
		if (s == 1) {
			return sound_dummy_1;
		} else if (s == 2) {
			return sound_dummy_2;
		} else if (s == 3) {
			return sound_dummy_3;
		} else if (s == 4) {
			return sound_dummy_4;
		} else if (s == 5) {
			return sound_dummy_5;
		} else if (s == 6) {
			return sound_dummy_6;
		} else if (s == 7) {
			return sound_dummy_7;
		} else if (s == 8) {
			return sound_dummy_8;
		} else if (s == 9) {
			return sound_dummy_9;
		} else if (s == 10) {
			return sound_dummy_10;
		} else if (s == 11) {
			return sound_dummy_11;
		} else if (s == 12) {
			return sound_dummy_12;
		} else if (s == 13) {
			return sound_dummy_13;
		} else if (s == 14) {
			return sound_dummy_14;
		} else if (s == 15) {
			return sound_dummy_15;
		} else if (s == 16) {
			return sound_dummy_16;
		} 
		return sound_1;
	}
	
	private void checkSwitchIsPress(int inp) {
		System.out.println(isSwitchPress[inp]);
		if (!isSwitchPress[inp]) {
			if (inp == 1) {
//				Button_1.play();
				playSound_1();
			} else if (inp == 2) {
//				Button_1.play();
				playSound_2();
			} else if (inp == 3) {
//				Button_1.play();
				playSound_3();
			} else if (inp == 4) {
//				Button_1.play();
				playSound_4();
			} else if (inp == 5) {
//				Button_1.play();
				playSound_5();
			} else if (inp == 6) {
//				Button_1.play();
				playSound_6();
			} else if (inp == 7) {
//				Button_1.play();
				playSound_7();
			} else if (inp == 8) {
//				Button_1.play();
				playSound_8();
			} else if (inp == 9) {
//				Button_1.play();
				playSound_9();
			} else if (inp == 10) {
//				muteAll();
				playSound_10();
			} else if (inp == 11) {
//				muteAll();
				playSound_11();
			} else if (inp == 12) {
//				muteAll();
				playSound_12();
			} else if (inp == 13) {
//				muteAll();
				playSound_13();
			} else if (inp == 14) {
//				muteAll();
				playSound_14();
			} else if (inp == 15) {
//				muteAll();
				playSound_15();
			} else if (inp == 16) {
//				muteAll();
				playSound_16();
//			}
		} else {
			if (inp == 1) {
				stopSound_1();
			} else if (inp == 2) {
				stopSound_2();
			} else if (inp == 3) {
				stopSound_3();
			} else if (inp == 4) {
				stopSound_4();
			} else if (inp == 5) {
				stopSound_5();
			} else if (inp == 6) {
				stopSound_6();
			} else if (inp == 7) {
				stopSound_7();
			} else if (inp == 8) {
				stopSound_8();
			} else if (inp == 9) {
				stopSound_9();
			} else if (inp == 10) {
				stopSound_10();
			} else if (inp == 11) {
				stopSound_11();
			} else if (inp == 12) {
				stopSound_12();
			} else if (inp == 13) {
				stopSound_13();
			} else if (inp == 14) {
				stopSound_14();
			} else if (inp == 15) {
				stopSound_15();
			} else if (inp == 16) {
				stopSound_16();
			}
		}
		isSwitchPress[World.sw] = !isSwitchPress[World.sw];
		}
	}
	
	public void playWithSwitch() {
		if (World.sw == 1) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 2) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 3) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 4) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw== 5) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 6) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 7) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 8) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 9) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 10) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 11) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 12) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 13) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 14) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 15) {
			checkSwitchIsPress(World.sw);
		} else if (World.sw == 16) {
			checkSwitchIsPress(World.sw);
		}
	}
	
	public void muteAll() {
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
