package net.object.test;

public class Fonction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void pause(int i)  {
		try {Thread.sleep(i);} catch(Exception e) {System.err.println("Error: " + e);}
	}

}
