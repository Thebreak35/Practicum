package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRender {
	SpriteBatch batch;
	Texture bg,
			menu_sound_bg,
			menu_sound_1,
			menu_sound_2,
			menu_sound_3,
			menu_sound_4,
			menu_sound_5,
			menu_sound_6,
			menu_sound_7,
			menu_sound_8,
			menu_sound_9,
			menu_sound_10,
			menu_sound_11,
			menu_sound_12,
			menu_sound_13,
			menu_sound_14,
			menu_sound_15,
			menu_sound_16,
			menu_sound_reset;
	Button 	button_1,
			button_2,
			button_3,
			button_4,
			button_5,
			button_6,
			button_7,
			button_8,
			button_9,
			button_10,
			button_11,
			button_12,
			button_13,
			button_14,
			button_15,
			button_16;
	
	public WorldRender() {
		batch = new SpriteBatch();
		bg = new Texture("bg.png");
		button_1 = new Button();
		button_2 = new Button();
		button_3 = new Button();
		button_4 = new Button();
		button_5 = new Button();
		button_6 = new Button();
		button_7 = new Button();
		button_8 = new Button();
		button_9 = new Button();
		button_10 = new Button();
		button_11 = new Button();
		button_12 = new Button();
		button_13 = new Button();
		button_14 = new Button();
		button_15 = new Button();
		button_16 = new Button();
		button_1.iniButton("button_1","button_1_press",1);
		button_2.iniButton("button_2","button_2_press",2);
		button_3.iniButton("button_3","button_3_press",3);
		button_4.iniButton("button_4","button_4_press",4);
		button_5.iniButton("button_5","button_5_press",5);
		button_6.iniButton("button_6","button_6_press",6);
		button_7.iniButton("button_7","button_7_press",7);
		button_8.iniButton("button_8","button_8_press",8);
		button_9.iniButton("button_9","button_9_press",9);
		button_10.iniButton("button_10","button_10_press",10);
		button_11.iniButton("button_11","button_11_press",11);
		button_12.iniButton("button_12","button_12_press",12);
		button_13.iniButton("button_13","button_13_press",13);
		button_14.iniButton("button_14","button_14_press",14);
		button_15.iniButton("button_15","button_15_press",15);
		button_16.iniButton("button_16","button_16_press",16);
		menu_sound_bg = new Texture("menu_sound_bg.png");
		menu_sound_1 = new Texture("menu_sound_1.png");
		menu_sound_2 = new Texture("menu_sound_2.png");
		menu_sound_3 = new Texture("menu_sound_3.png");
		menu_sound_4 = new Texture("menu_sound_4.png");
		menu_sound_5 = new Texture("menu_sound_5.png");
		menu_sound_6 = new Texture("menu_sound_6.png");
		menu_sound_7 = new Texture("menu_sound_7.png");
		menu_sound_8 = new Texture("menu_sound_8.png");
		menu_sound_9 = new Texture("menu_sound_9.png");
		menu_sound_10 = new Texture("menu_sound_10.png");
		menu_sound_11 = new Texture("menu_sound_11.png");
		menu_sound_12 = new Texture("menu_sound_12.png");
		menu_sound_13 = new Texture("menu_sound_13.png");
		menu_sound_14 = new Texture("menu_sound_14.png");
		menu_sound_15 = new Texture("menu_sound_15.png");
		menu_sound_16 = new Texture("menu_sound_16.png");
		menu_sound_reset = new Texture("menu_sound_reset.png");
		
	}
	
	public void render() {
		renderBG();
		button_1.renderButton();
		button_2.renderButton();
		button_3.renderButton();
		button_4.renderButton();
		button_5.renderButton();
		button_6.renderButton();
		button_7.renderButton();
		button_8.renderButton();
		button_9.renderButton();
		button_10.renderButton();
		button_11.renderButton();
		button_12.renderButton();
		button_13.renderButton();
		button_14.renderButton();
		button_15.renderButton();
		button_16.renderButton();
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
		batch.draw(menu_sound_1, 800 - 361 + 25, 600 - 50);
		batch.draw(menu_sound_2, 800 - 361 + 200 , 600 - 50);
		batch.draw(menu_sound_3, 800 - 361 + 25, 600 - 50*2);
		batch.draw(menu_sound_4, 800 - 361 + 200 , 600 - 50*2);
		batch.draw(menu_sound_5, 800 - 361 + 25, 600 - 50*3);
		batch.draw(menu_sound_6, 800 - 361 + 200 , 600 - 50*3);
		batch.draw(menu_sound_7, 800 - 361 + 25, 600 - 50*4);
		batch.draw(menu_sound_8, 800 - 361 + 200 , 600 - 50*4);
		batch.draw(menu_sound_9, 800 - 361 + 25, 600 - 50*5);
		batch.draw(menu_sound_10, 800 - 361 + 200 , 600 - 50*5);
		batch.draw(menu_sound_11, 800 - 361 + 25, 600 - 50*6);
		batch.draw(menu_sound_12, 800 - 361 + 200 , 600 - 50*6);
		batch.draw(menu_sound_13, 800 - 361 + 25, 600 - 50*7);
		batch.draw(menu_sound_14, 800 - 361 + 200 , 600 - 50*7);
		batch.draw(menu_sound_15, 800 - 361 + 25, 600 - 50*8);
		batch.draw(menu_sound_16, 800 - 361 + 200 , 600 - 50*8);
		batch.draw(menu_sound_reset, 800 - 361 + 110, 0);
		batch.end();
	}
}
