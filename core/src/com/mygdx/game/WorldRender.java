package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRender {
	SpriteBatch batch;
	Texture bg,
			button_1,
			button_1_press;
	
	public WorldRender() {
		batch = new SpriteBatch();
		bg = new Texture("bg.png");
		button_1 = new Texture("button_1.png");
		button_1_press = new Texture("button_1_press.png");
	}
	
	public void render() {
		renderBG();
		renderButton_1();
	}
	
	private void renderBG() {
		batch.begin();
		batch.draw(bg, 0, 0);
		batch.end();
	}
	
	private void renderButton_1() {
		if(!World.isClick()) {
			batch.begin();
			batch.draw(button_1, 50, 600 - 100);
			batch.end();
		} else {
			batch.begin();
			batch.draw(button_1_press, 50, 600 - 100);
			batch.end();
			}		
	}
}
