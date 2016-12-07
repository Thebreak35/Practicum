package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class World {
	static Vector2 vector;
	static Rectangle 	button_1,
						menuSound;
	static Button_1 button_logic_1,
					button_logic_2,
					button_logic_3,
					button_logic_4,
					button_logic_5,
					button_logic_6,
					button_logic_7,
					button_logic_8,
					button_logic_9,
					button_logic_10,
					button_logic_11,
					button_logic_12,
					button_logic_13,
					button_logic_14,
					button_logic_15,
					button_logic_16;
	
	public World() {
		vector = new Vector2();
		button_1 = new Rectangle(0, 0, 50, 50);
		button_1.setPosition(0, 50);
		menuSound = new Rectangle(0, 0, 361, 600);
		menuSound.setPosition(800 - 361, 0);
		
		button_logic_1 = new Button_1();
		button_logic_1.setSound(1);
		button_logic_1.resetButton_1();
		
//		button_logic_2 = new Button_1();
//		button_logic_2.setSound(1);
//		
//		button_logic_3 = new Button_1();
//		button_logic_3.setSound(1);
//		
//		button_logic_4 = new Button_1();
//		button_logic_4.setSound(1);
//		
//		button_logic_5 = new Button_1();
//		button_logic_5.setSound(1);
//		
//		button_logic_6 = new Button_1();
//		button_logic_6.setSound(1);
//		
//		button_logic_7 = new Button_1();
//		button_logic_7.setSound(1);
//		
//		button_logic_8 = new Button_1();
//		button_logic_8.setSound(1);
//		
//		button_logic_9 = new Button_1();
//		button_logic_9.setSound(1);
//		
//		button_logic_10 = new Button_1();
//		button_logic_10.setSound(1);
//		
//		button_logic_11 = new Button_1();
//		button_logic_11.setSound(1);
//		
//		button_logic_12 = new Button_1();
//		button_logic_12.setSound(1);
//		
//		button_logic_13 = new Button_1();
//		button_logic_13.setSound(1);
//		
//		button_logic_14 = new Button_1();
//		button_logic_14.setSound(1);
//		
//		button_logic_15 = new Button_1();
//		button_logic_15.setSound(1);
//		
//		button_logic_16 = new Button_1();
//		button_logic_16.setSound(1);
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
		isClickMenu();
		button_logic_1.soundfx.playWithSwitch();
//		System.out.println(returnBooleanButton_1Class(1));
	}
	
	public static boolean isClick_1(int inp) {
		if (Gdx.input.justTouched()) {
			if(button_1.contains(vector)) {
				if (inp == 1) {
					System.out.println("Here");
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else {
				if (inp == 2) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			}
		}
		return false;
	}
	
	public void isClickMenu() {
		if(Gdx.input.justTouched()) {
			if(menuSound.contains(vector)) {
				button_logic_1.stop();
				button_logic_1.setSound(2);
			}
		}
	}
	
	public static boolean returnBooleanButton_1Class(int inp) {
		return Button_1.isClick[inp];
	}
}
