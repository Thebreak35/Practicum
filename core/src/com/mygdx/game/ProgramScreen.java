package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
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
		world.update();
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		worldRender.render();	
	}
}
