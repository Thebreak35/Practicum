package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.TestApp;
import com.mygdx.game.McuBoard;

public class World {
	static Vector2 vector;
	static Rectangle 	button_1,
						menuSound;
	static Button_1 button_logic_1;
	
	public World() {
		vector = new Vector2();
		button_1 = new Rectangle(0, 0, 50, 50);
		button_1.setPosition(50, 50);
		menuSound = new Rectangle(0, 0, 361, 600);
		menuSound.setPosition(800 - 361, 0);
		button_logic_1 = new Button_1();
		button_logic_1.setSound(1);
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
		isClickMenu();
		button_logic_1.soundfx.playWithSwitch();
	}
	
	public static boolean isClick_1() {
		if(Gdx.input.justTouched()) {
			if(button_1.contains(vector)) {
				button_logic_1.changeState();
				if(button_logic_1.isClick == true) {
					button_logic_1.play();
				} else {
					button_logic_1.stop();
				}
				return button_logic_1.isClick;
			}
		}
		return button_logic_1.isClick;
	}
	
	public void isClickMenu() {
		if(Gdx.input.justTouched()) {
			if(menuSound.contains(vector)) {
				button_logic_1.stop();
				button_logic_1.setSound(2);
			}
		}
	}
}
