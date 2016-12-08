package com.mygdx.game;

import org.usb4java.Device;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class World {
	static McuBoard board;
	public static int switchOutput;
    public static int sw;
	static Vector2 vector;
	static Rectangle 	button_1,
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
						button_16,
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
		McuBoard.initUsb();
		try
        {
        	Device[] devices = McuBoard.findBoards();
        	
        	if (devices.length == 0) {
                System.out.format("** Practicum board not found **\n");
                return;
        	}
        	else {
                System.out.format("** Found %d practicum board(s) **\n", devices.length);
        	}
        	board = new McuBoard(devices[0]);
            System.out.format("** Practicum board found **\n");
            System.out.format("** Manufacturer: %s\n", board.getManufacturer());
            System.out.format("** Product: %s\n", board.getProduct());    
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
		vector = new Vector2();
		
		button_1 = new Rectangle(0, 0, 50, 50);
		button_1.setPosition(100, 50);
		
		button_2 = new Rectangle(0, 0, 50, 50);
		button_2.setPosition(150, 50);
		
		button_3 = new Rectangle(0, 0, 50, 50);
		button_3.setPosition(200, 50);
		
		button_4 = new Rectangle(0, 0, 50, 50);
		button_4.setPosition(250, 50);

		button_5 = new Rectangle(0, 0, 50, 50);
		button_5.setPosition(100, 150);
		
		button_6 = new Rectangle(0, 0, 50, 50);
		button_6.setPosition(150, 150);
		
		button_7 = new Rectangle(0, 0, 50, 50);
		button_7.setPosition(200, 150);
		
		button_8 = new Rectangle(0, 0, 50, 50);
		button_8.setPosition(250, 150);
		
		button_9 = new Rectangle(0, 0, 50, 50);
		button_9.setPosition(100, 250);
		
		button_10 = new Rectangle(0, 0, 50, 50);
		button_10.setPosition(150, 250);
		
		button_11 = new Rectangle(0, 0, 50, 50);
		button_11.setPosition(200, 250);
		
		button_12 = new Rectangle(0, 0, 50, 50);
		button_12.setPosition(250, 250);
		
		button_13 = new Rectangle(0, 0, 50, 50);
		button_13.setPosition(100, 350);
		
		button_14 = new Rectangle(0, 0, 50, 50);
		button_14.setPosition(150, 350);
		
		button_15 = new Rectangle(0, 0, 50, 50);
		button_15.setPosition(200, 350);
		
		button_16 = new Rectangle(0, 0, 50, 50);
		button_16.setPosition(250, 350);
		
		menuSound = new Rectangle(0, 0, 361, 600);
		menuSound.setPosition(800 - 361, 0);
		
		button_logic_1 = new Button_1();
		button_logic_1.setSound(1);
		button_logic_1.resetButton_1();
		
		button_logic_2 = new Button_1();
		button_logic_2.setSound(2);
		button_logic_2.resetButton_1();
		
		button_logic_3 = new Button_1();
		button_logic_3.setSound(3);
		button_logic_3.resetButton_1();
		
		button_logic_4 = new Button_1();
		button_logic_4.setSound(4);
		button_logic_4.resetButton_1();
		
		button_logic_5 = new Button_1();
		button_logic_5.setSound(1);
		button_logic_5.resetButton_1();
		
		button_logic_6 = new Button_1();
		button_logic_6.setSound(1);
		button_logic_6.resetButton_1();
		
		button_logic_7 = new Button_1();
		button_logic_7.setSound(1);
		button_logic_7.resetButton_1();
		
		button_logic_8 = new Button_1();
		button_logic_8.setSound(1);
		button_logic_8.resetButton_1();
		
		button_logic_9 = new Button_1();
		button_logic_9.setSound(1);
		button_logic_9.resetButton_1();
		
		button_logic_10 = new Button_1();
		button_logic_10.setSound(1);
		button_logic_10.resetButton_1();
		
		button_logic_11 = new Button_1();
		button_logic_11.setSound(1);
		button_logic_11.resetButton_1();
		
		button_logic_12 = new Button_1();
		button_logic_12.setSound(1);
		button_logic_12.resetButton_1();
		
		button_logic_13 = new Button_1();
		button_logic_13.setSound(1);
		button_logic_13.resetButton_1();
		
		button_logic_14 = new Button_1();
		button_logic_14.setSound(1);
		button_logic_14.resetButton_1();
		
		button_logic_15 = new Button_1();
		button_logic_15.setSound(1);
		button_logic_15.resetButton_1();
		
		button_logic_16 = new Button_1();
		button_logic_16.setSound(1);
		button_logic_16.resetButton_1();
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
		isClickMenu();
		button_logic_1.soundfx.playWithSwitch();         	
        	try {
//GET SWITCH
        		byte[] sw1 = board.read((byte)1, (short)0, (short)0);
        		sw = (sw1[0] & 0xFF);
        		switchOutput = sw;
        		System.out.format("Switch state : %s\n",sw);
//SET FUNCTION
        		board.write((byte)2, (short) 0, (short) sw);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
	}
	
	public static boolean isClick_1(int inp) {
		if (Gdx.input.justTouched()) {
			if (button_1.contains(vector)) {
				if (inp == 1) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_2.contains(vector)) {
				if (inp == 2) {
					button_logic_1.changeState(inp);
					if(button_logic_2.isClick[inp]) {
						button_logic_2.play();
					} else {
						button_logic_2.stop();
					}
					return button_logic_2.isClick[inp];
				}
			} else if (button_3.contains(vector)) {
				if (inp == 3) {
					button_logic_3.changeState(inp);
					if(button_logic_3.isClick[inp]) {
						button_logic_3.play();
					} else {
						button_logic_3.stop();
					}
					return button_logic_3.isClick[inp];
				}
			} else if (button_4.contains(vector)) {
				if (inp == 4) {
					button_logic_4.changeState(inp);
					if(button_logic_4.isClick[inp]) {
						button_logic_4.play();
					} else {
						button_logic_4.stop();
					}
					return button_logic_4.isClick[inp];
				}
			} else if (button_5.contains(vector)) {
				if (inp == 5) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_6.contains(vector)) {
				if (inp == 6) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_7.contains(vector)) {
				if (inp == 7) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_8.contains(vector)) {
				if (inp == 8) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_9.contains(vector)) {
				if (inp == 9) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_10.contains(vector)) {
				if (inp == 10) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_11.contains(vector)) {
				if (inp == 11) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_12.contains(vector)) {
				if (inp == 12) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_13.contains(vector)) {
				if (inp == 13) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_14.contains(vector)) {
				if (inp == 14) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_15.contains(vector)) {
				if (inp == 15) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						button_logic_1.play();
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}
			} else if (button_16.contains(vector)) {
				if (inp == 16) {
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
