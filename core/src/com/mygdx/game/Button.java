package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Button {
	Texture buttonSkin,
			buttonSkin_press;
	SpriteBatch batch;
	public int buttonNumber;
	private int x,y;
	public Button() {
		batch = new SpriteBatch();
	}
	
	public void iniButton(String buttonName,String pressName ,int number) {
		buttonSkin = new Texture(buttonName+".png");
		buttonSkin_press = new Texture(pressName+".png");
		buttonNumber = number;
		x = 50*((buttonNumber-1)%4) + 100;
		if (buttonNumber <=4) {
			y = 500;
		} else if (buttonNumber > 4 && buttonNumber < 9) {
			y = 400;
		} else if (buttonNumber >= 9 && buttonNumber < 13) {
			y = 300;
		} else {
			y = 200;
		}
	}
	
	public void renderButton() {
//		if (!World.isClick_1(buttonNumber)) {
		World.isClick_1(buttonNumber);
		if (!World.returnBooleanButton_1Class(buttonNumber)) {
			batch.begin();
			batch.draw(buttonSkin, x, y);
			batch.end();
		} else {
			batch.begin();
			batch.draw(buttonSkin_press, x, y);
			batch.end();
			}		
	}
}
