package com.mygdx.game;

import org.usb4java.Device;

public class TestApp {
    static McuBoard board;
    public static int switchOutput;
    public static void main(String[] args) {
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
            
            
            
            while (true)  {           	
            	try {
//  GET SWITCH
            		byte[] sw1 = board.read((byte)1, (short)0, (short)0);
            		int sw = (sw1[0] & 0xFF);
            		switchOutput = sw;
            		System.out.format("Switch state : %s\n",sw);
// SET FUNCTION
            		board.write((byte)2, (short) 0, (short) sw);
        		} catch (Exception e) {
        			e.printStackTrace();
        		}
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
