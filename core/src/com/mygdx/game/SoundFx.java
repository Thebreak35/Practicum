package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;

public class SoundFx {

	Sound sound_1;
	
	public SoundFx() {
		sound_1 = Gdx.audio.newSound(Gdx.files.internal("sound_1.mp3"));
	}
	
	public void playSound_1() {
		sound_1.play();
		sound_1.loop();
	}
	
	public void stopSound_1() {
		sound_1.stop();
	}
}
