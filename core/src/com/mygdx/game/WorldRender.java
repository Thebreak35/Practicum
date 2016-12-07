package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRender {
	SpriteBatch batch;
	Texture bg,
			menu_sound_bg;
	Button button_1;
	
	public WorldRender() {
		batch = new SpriteBatch();
		bg = new Texture("bg.png");
		button_1 = new Button();
		button_1.iniButton("button_1","button_1_press",1);
		menu_sound_bg = new Texture("menu_sound_bg.png");
	}
	
	public void render() {
		renderBG();
		button_1.renderButton();
		renderMenuSound();
	}
	
	private void renderBG() {
		batch.begin();
		batch.draw(bg, 0, 0);
		batch.end();
	}
	
	private void renderMenuSound() {
		batch.begin();
		batch.draw(menu_sound_bg, 800 - 361, 0);
		batch.end();
	}
}
