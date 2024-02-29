package com.neotech.lesson01;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println(name);
		
		System.out.print("How are you? ");
		String mood = scanner.nextLine();
		System.out.println(mood);
		
		System.out.printf("Hello %s, how old are you? ", name);
//		int age = scanner.nextInt();
		int age = Integer.parseInt(scanner.nextLine());
		
		//cleans up the input buffer (extra chars.) After nextInt, nextDouble etc we need this
//		scanner.nextLine();
			
		System.out.printf("%d is an excellent age to start this boothcamp!. What language do you prefer? ", age);
		String language = scanner.nextLine();
		
		System.out.printf("%s is a very popular programming language.", language);
		scanner.close();
		
		System.out.println("\nYour preferred language is " + language + ".\nYour name is " + name +".");

	}
}
