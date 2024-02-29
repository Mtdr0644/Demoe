package com.neotech.lesson01;

public class WorkAroundWithString01 {

	public static void main(String[] args) {

		String name = "Ulku Cili";
		String country = "Turkiye";
		String residency = "Dallas";
		String bootcampName = "Neotech Academy";
		int yearGraduate = 2024;
		char percentSign = '%';
		boolean isItTrue = false;
				
		String infoTotal = String.format("My name is %s. "
				+ "I am from %s. I live in %s. "
				+ "I am currently attending %s. "
				+ "I will graduate in %d. I am planning to attend 100%c of my classes. "
				+ "And some of these claims are %b", 
				name, country, residency, bootcampName, yearGraduate, percentSign, isItTrue);
		
		System.out.println(infoTotal);
		System.out.println(name.length());
		System.out.println(country.length());
		System.out.println(residency.length());
		System.out.println(bootcampName.length());
		System.out.println(name.isEmpty());
		
		System.out.println(name.toUpperCase());
		System.out.println(name);
		System.out.println(name.toLowerCase());
		
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));	
		s2 = new String("ABC");
		System.out.println(s1.equals(s2));	
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = "The sky is blue.";
		System.out.println(s3.replace("blue", "red"));
		System.out.println(s3);
		s3 = s3.replace("blue", "red");
		System.out.println(s3);
		System.out.println(s3.contains("sky"));
//		String name2 = new String ("Lal Cili");
//		System.out.println(name2);
//		//how to reformat the code: CTRL+SHIFT+F
		
	}

}