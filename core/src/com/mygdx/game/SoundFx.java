package com.mygdx.game;

import java.util.concurrent.TimeUnit;

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
		for (int i = 0 ; i < 17 ; i ++) {
			isSwitchPress[i] = false;
		}
	}
	
	public void justWait() {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			} 
//			else if (inp == 10) {
//				muteAll();
//				playSound_10();
//			} else if (inp == 11) {
//				muteAll();
//				playSound_11();
//			} else if (inp == 12) {
//				muteAll();
//				playSound_12();
//			} else if (inp == 13) {
//				muteAll();
//				playSound_13();
//			} else if (inp == 14) {
//				muteAll();
//				playSound_14();
//			} else if (inp == 15) {
//				muteAll();
//				playSound_15();
//			} else if (inp == 16) {
//				muteAll();
//				playSound_16();
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
			} 
//			else if (inp == 10) {
//				muteAll();
//				stopSound_10();
//			} else if (inp == 11) {
//				muteAll();
//				stopSound_11();
//			} else if (inp == 12) {
//				muteAll();
//				stopSound_12();
//			} else if (inp == 13) {
//				muteAll();
//				stopSound_13();
//			} else if (inp == 14) {
//				muteAll();
//				stopSound_14();
//			} else if (inp == 15) {
//				muteAll();
//				stopSound_15();
//			} else if (inp == 16) {
//				muteAll();
//				stopSound_16();
//			}
		}
		isSwitchPress[World.sw] = !isSwitchPress[World.sw];
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
		} 
//		else if (World.sw == 10) {
//			muteAll();
//			playSound_10();
//		} else if (World.sw == 11) {
//			muteAll();
//			playSound_11();
//		} else if (World.sw == 12) {
//			muteAll();
//			playSound_12();
//		} else if (World.sw == 13) {
//			muteAll();
//			playSound_13();
//		} else if (World.sw == 14) {
//			muteAll();
//			playSound_14();
//		} else if (World.sw == 15) {
//			muteAll();
//			playSound_15();
//		} else if (World.sw == 16) {
//			muteAll();
//			playSound_16();
//		}
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
//		sound_10.stop();
//		sound_11.stop();
//		sound_12.stop();
//		sound_13.stop();
//		sound_14.stop();
//		sound_15.stop();
//		sound_16.stop();
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
