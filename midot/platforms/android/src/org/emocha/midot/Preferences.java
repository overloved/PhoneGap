package org.emocha.midot;

import java.util.Random;

public class Preferences {
	public static String SALT = "";
	public static String IV = "";
			
	public void random() {
		Random random = new Random();
		SALT = String.valueOf((char)(random.nextInt(26) + 'a'));
		IV = String.valueOf((char)(random.nextInt(26) + 'a'));
	}
}