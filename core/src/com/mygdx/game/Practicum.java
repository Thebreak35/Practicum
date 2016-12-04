package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Practicum extends Game {
	public SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new ProgramScreen(this));
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
