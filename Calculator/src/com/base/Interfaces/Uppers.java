package com.base.Interfaces;

public interface Uppers {
	public int up();

	// Reduce el nivel
	public int down();
	// Resetea el nivel
	public void reset();

	// Obtener el nivel
	public int value();
	
	public void close();
}
