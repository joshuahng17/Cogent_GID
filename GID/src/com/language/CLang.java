package com.language;

public class CLang extends Thread implements Language{

	public void showMessage() {
		System.out.println("C program is running");
	}
	
	public void run() {
		showMessage();
	}
}
