package com.language;

public class JavaLang extends Thread implements Language{

	public void showMessage() {
		System.out.println("Java Program is running");
	}
	
	public void run() {
		showMessage();
	}

}
