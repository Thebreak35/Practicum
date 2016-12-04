package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class World {
	static Vector2 vector;
	static Rectangle button_1;
	static boolean isButton_1_click = false;
	
	public World() {
		vector = new Vector2();
		button_1 = new Rectangle(50, 100 - 50, 50, 50);
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
	}
	
	public static boolean isClick() {
		if(Gdx.input.justTouched()) {
			if(button_1.contains(vector)) {
				isButton_1_click = !isButton_1_click;
				return isButton_1_click;
			}
		}
		return isButton_1_click;
	}
}
