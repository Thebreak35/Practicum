package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class World {
	static Vector2 vector;
	static Rectangle button_1;
	static boolean isButton_1_click = false;
	
	static SoundFx sound_1;
	
	public World() {
		vector = new Vector2();
		button_1 = new Rectangle(50, 100 - 50, 50, 50);
		sound_1 = new SoundFx();
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
		
		System.out.println(isButton_1_click);
	}
	
	public static boolean isClick() {
		if(Gdx.input.justTouched()) {
			if(button_1.contains(vector)) {
				isButton_1_click = !isButton_1_click;
				if(isButton_1_click == true) {
					sound_1.playSound_1();
				} else {
					sound_1.stopSound_1();
				}
				return isButton_1_click;
			}
		}
		return isButton_1_click;
	}
}
