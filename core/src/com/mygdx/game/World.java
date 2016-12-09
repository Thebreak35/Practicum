package com.mygdx.game;

import java.util.concurrent.TimeUnit;

import org.usb4java.Device;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class World {
	static McuBoard board;
	public static int switchOutput = 30;
    public static int sw;
    boolean[] menu = new boolean[17];
    SoundFx fx;
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
						menuSound,
						menu1,
						menu2,
						menu3,
						menu4,
						menu5,
						menu6,
						menu7,
						menu8,
						menu9,
						menu10,
						menu11,
						menu12,
						menu13,
						menu14,
						menu15,
						menu16,
						menuReset;
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
		
		fx = new SoundFx();
		
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
		
		menu1 = new Rectangle(0, 0, 150, 50);
		menu1.setPosition(800 - 361 + 25, 50*1 - 50);
		
		menu2 = new Rectangle(0, 0, 150, 50);
		menu2.setPosition(800 - 361 + 200 , 50*1 - 50);
		
		menu3 = new Rectangle(0, 0, 150, 50);
		menu3.setPosition(800 - 361 + 25, 50*2 - 50);
		
		menu4 = new Rectangle(0, 0, 150, 50);
		menu4.setPosition(800 - 361 + 200 , 50*2 - 50);
		
		menu5 = new Rectangle(0, 0, 150, 50);
		menu5.setPosition(800 - 361 + 25, 50*3 - 50);
		
		menu6 = new Rectangle(0, 0, 150, 50);
		menu6.setPosition(800 - 361 + 200 , 50*3 - 50);
		
		menu7 = new Rectangle(0, 0, 150, 50);
		menu7.setPosition(800 - 361 + 25, 50*4 - 50);
		
		menu8 = new Rectangle(0, 0, 150, 50);
		menu8.setPosition(800 - 361 + 200 , 50*4 - 50);
		
		menu9 = new Rectangle(0, 0, 150, 50);
		menu9.setPosition(800 - 361 + 25, 50*5 - 50);
		
		menu10 = new Rectangle(0, 0, 150, 50);
		menu10.setPosition(800 - 361 + 200 , 50*5 - 50);
		
		menu11 = new Rectangle(0, 0, 150, 50);
		menu11.setPosition(800 - 361 + 25, 50*6 - 50);
		
		menu12 = new Rectangle(0, 0, 150, 50);
		menu12.setPosition(800 - 361 + 200 , 50*6 - 50);
		
		menu13 = new Rectangle(0, 0, 150, 50);
		menu13.setPosition(800 - 361 + 25, 50*7 - 50);
		
		menu14 = new Rectangle(0, 0, 150, 50);
		menu14.setPosition(800 - 361 + 200 , 50*7 - 50);
		
		menu15 = new Rectangle(0, 0, 150, 50);
		menu15.setPosition(800 - 361 + 25, 50*8 - 50);
		
		menu16 = new Rectangle(0, 0, 150, 50);
		menu16.setPosition(800 - 361 + 200 , 50*8 - 50);
		
		menuReset = new Rectangle(0, 0, 150, 50);
		menuReset.setPosition(800 - 361 + 110, 600 - 50);
		
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
		button_logic_5.setSound(5);
		button_logic_5.resetButton_1();
		
		button_logic_6 = new Button_1();
		button_logic_6.setSound(6);
		button_logic_6.resetButton_1();
		
		button_logic_7 = new Button_1();
		button_logic_7.setSound(7);
		button_logic_7.resetButton_1();
		
		button_logic_8 = new Button_1();
		button_logic_8.setSound(8);
		button_logic_8.resetButton_1();
		
		button_logic_9 = new Button_1();
		button_logic_9.setSound(9);
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
		
		for (int i = 0 ; i < 17 ; i++) {
			menu[i] = false;
		}
	}
	
	public void update() {
		vector.x = Gdx.input.getX();
		vector.y = Gdx.input.getY();
		isClickMenu();
//		soundfx.playWithSwitch();
        	try {
//GET SWITCH
        		byte[] sw1 = board.read((byte)1, (short)0, (short)0);
        		sw = (sw1[0] & 0xFF);
        		if(sw != switchOutput) {
        			button_logic_1.soundfx.playWithSwitch();  
//        			System.out.println(switchOutput);
            		switchOutput = sw;
        		}
//        		switchOutput = sw;
//        		System.out.format("Switch state : %s\n",sw);
//SET FUNCTION
        		board.write((byte)2, (short) 0, (short) sw);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        	
//        	button_logic_1.soundfx.playWithSwitch();        	
	}
	
	public static boolean isClick_1(int inp) {
//		System.out.println(inp);
		if (inp == 1) {
			if (Gdx.input.justTouched()) {
				if (button_1.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}	
					return button_logic_1.isClick[inp];
				}
			}
		} if (inp == 2) {
			if (Gdx.input.justTouched()) {
				if (button_2.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_2.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_2.stop();
					}
					return button_logic_2.isClick[inp];
				}
			}
		} if (inp == 3) {
			if (Gdx.input.justTouched()) {
				if (button_3.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_3.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_3.stop();
					}
					return button_logic_3.isClick[inp];
				}
			}
		} if (inp == 4) {
			if (Gdx.input.justTouched()) {
				if (button_4.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_4.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_4.stop();
					}
					return button_logic_4.isClick[inp];
				}
			}
		} if (inp == 5) {
			if (Gdx.input.justTouched()) {
				if (button_5.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_5.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_5.stop();
					}
					return button_logic_5.isClick[inp];
				}
			}
		} if (inp == 6) {
			if (Gdx.input.justTouched()) {
				if (button_6.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_6.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_6.stop();
					}
					return button_logic_6.isClick[inp];
				}
			}
		} if (inp == 7) {
			if (Gdx.input.justTouched()) {
				if (button_7.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_7.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_7.stop();
					}
					return button_logic_7.isClick[inp];
				}		
			}
		} if (inp == 8) {
			if (Gdx.input.justTouched()) {
				if (button_8.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_8.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_8.stop();
					}
					return button_logic_8.isClick[inp];
				}
			}
		} if (inp == 9) {
			if (Gdx.input.justTouched()) {
				if (button_9.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_9.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_9.stop();
					}
					return button_logic_9.isClick[inp];
				}		
			}
		} if (inp == 10) {
			if (Gdx.input.justTouched()) {
				if (button_10.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 11) {
			if (Gdx.input.justTouched()) {
				if (button_11.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 12) {
			if (Gdx.input.justTouched()) {
				if (button_12.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 13) {
			if (Gdx.input.justTouched()) {
				if (button_13.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 14) {
			if (Gdx.input.justTouched()) {
				if (button_14.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 15) {
			if (Gdx.input.justTouched()) {
				if (button_15.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
					} else {
						button_logic_1.stop();
					}
					return button_logic_1.isClick[inp];
				}		
			}
		} if (inp == 16) {
			if (Gdx.input.justTouched()) {
				if (button_16.contains(vector)) {
					button_logic_1.changeState(inp);
					if(button_logic_1.isClick[inp]) {
						change();
						System.out.println("Change Complete!");
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
		if (Gdx.input.justTouched()) {
			if (menuReset.contains(vector)) {
				button_logic_1.soundfx.muteAll();
				for (int i = 0 ; i < 17 ; i++) {
					button_logic_1.soundfx.isSwitchPress[i] = false;
				}
			}
			if (menu1.contains(vector)) {
				menu[1] = !menu[1];
				if (menu[1]) {
					fx.playSound_1();
					System.out.println("HERE");
				} else {
					fx.stopSound_1();
				}
			}
			if (menu2.contains(vector)) {
				menu[2] = !menu[2];
				if (menu[2]) {
					fx.playSound_2();
				} else {
					fx.stopSound_2();
				}
			}
			if (menu3.contains(vector)) {
				menu[3] = !menu[3];
				if (menu[3]) {
					fx.playSound_3();
				} else {
					fx.stopSound_3();
				}
			}
			if (menu4.contains(vector)) {
				menu[4] = !menu[4];
				if (menu[4]) {
					fx.playSound_4();
				} else {
					fx.stopSound_4();
				}
			}
			if (menu5.contains(vector)) {
				menu[5] = !menu[5];
				if (menu[5]) {
					fx.playSound_5();
				} else {
					fx.stopSound_5();
				}
			}
			if (menu6.contains(vector)) {
				menu[6] = !menu[6];
				if (menu[6]) {
					fx.playSound_6();
				} else {
					fx.stopSound_6();
				}
			}
			if (menu7.contains(vector)) {
				menu[7] = !menu[7];
				if (menu[7]) {
					fx.playSound_7();
				} else {
					fx.stopSound_7();
				}
			}
			if (menu8.contains(vector)) {
				menu[8] = !menu[8];
				if (menu[8]) {
					fx.playSound_8();
				} else {
					fx.stopSound_8();
				}
			}
			if (menu9.contains(vector)) {
				menu[9] = !menu[9];
				if (menu[9]) {
					fx.playSound_9();
				} else {
					fx.stopSound_9();
				}
			}
		}
	}
	
	private static void change() {
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_1)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_2)) {
			button_logic_1.setSound(2);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_3)) {
			button_logic_1.setSound(3);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_4)) {
			button_logic_1.setSound(4);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_5)) {
			button_logic_1.setSound(5);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_6)) {
			button_logic_1.setSound(6);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_7)) {
			button_logic_1.setSound(7);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_8)) {
			button_logic_1.setSound(8);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_9)) {
			button_logic_1.setSound(9);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_1) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_2) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_3) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_4) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_5) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.NUM_6) && Gdx.input.isKeyPressed(Input.Keys.NUM_0)) {
			button_logic_1.setSound(1);
		}
	}
	
	public static boolean returnBooleanButton_1Class(int inp) {
		return Button_1.isClick[inp];
	}
}
