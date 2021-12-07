package com.base.Actions;

import java.util.Random;

public class CalculosLevels {
	private static CalculosLevels adm;
	
	private CalculosLevels() {
		
	}
	
	public static CalculosLevels getAdmin() {
		
		if(adm == null) {
			adm = new CalculosLevels();
		}
		
		return adm;
	}

	public int levelOperation(int lv) {
		int level = new Random().nextInt((lv % 4)) + 1;

		return level;
	}
	
}
