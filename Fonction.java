package net.object.test;

public class Fonction {
	
	public static void pause(int i)  {
		try {Thread.sleep(i);} catch(Exception e) {System.err.println("Error: " + e);}
	}

}
