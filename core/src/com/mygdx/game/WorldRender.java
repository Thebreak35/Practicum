package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRender {
	SpriteBatch batch;
	Texture bg;
	
	public WorldRender() {
		batch = new SpriteBatch();
		bg = new Texture("bg.png");
	}
	
	public void render() {
		renderBG();
	}
	
	private void renderBG() {
		batch.begin();
		batch.draw(bg, 0, 0);
		batch.end();
	}
}
