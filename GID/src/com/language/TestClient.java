package com.language;

import java.util.Scanner;

public class TestClient {

	public static void main(String[] args) {
		
		CLang cthread = new CLang();
		JavaLang jthread = new JavaLang();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which is your favorite language: Java or C?");
		String choice = sc.next();
		if(choice.equals("Java")) { //Set Java thread priority to highest and start it first
			jthread.setPriority(Thread.MAX_PRIORITY);
			cthread.setPriority(Thread.MIN_PRIORITY);
			jthread.start();
			cthread.start();
		}
		else if(choice.equals("C")) { //Set C thread priority to highest and start it first
			cthread.setPriority(Thread.MAX_PRIORITY);
			jthread.setPriority(Thread.MIN_PRIORITY);
			cthread.start();
			jthread.start();
		}
		else { //If any other input, start Java thread first at equal priority
		jthread.start();
		cthread.start();
		}
	}
}
