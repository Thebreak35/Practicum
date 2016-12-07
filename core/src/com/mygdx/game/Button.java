package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Button {
	Texture buttonSkin,
			buttonSkin_press;
	SpriteBatch batch;
	public int buttonNumber;
	public Button() {
		batch = new SpriteBatch();
	}
	
	public void iniButton(String buttonName,String pressName ,int number) {
		buttonSkin = new Texture(buttonName+".png");
		buttonSkin_press = new Texture(pressName+".png");
		buttonNumber = number;
	}
	
	public void renderButton() {
		if(!World.isClick_1()) {
			batch.begin();
			batch.draw(buttonSkin, 50, 600 - 100);
			batch.end();
		} else {
			batch.begin();
			batch.draw(buttonSkin_press, 50, 600 - 100);
			batch.end();
			}		
	}
}
