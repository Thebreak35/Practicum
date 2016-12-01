package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

public class ProgramScreen extends ScreenAdapter{
	
	Practicum prac;
	World world;
	WorldRender worldRender;
	
	public ProgramScreen(Practicum prac) {
		this.prac = prac;
		world = new World();
		worldRender = new WorldRender();
	}
		
	@Override
	public void render(float delta) {
		world.render();
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		worldRender.update();
	}
		
}
