package com.cts.strings;

public class StringsTest {
	public static void main(String args[]){
		Strings strings=new Strings();
		//Comparing two strings
		System.out.println(strings.compareString("Vishal","Vishal"));
		System.out.println(strings.compareString("Vishal","Visha"));
		System.out.println(strings.compareString("Vishal","Vishak"));
		//Reversing a string
		System.out.println(strings.reverseString("Vishal"));
		//Palindrome
		System.out.println(strings.palindrome("Vishal"));
		System.out.println(strings.palindrome("civic"));
		//Counting number characters
		System.out.println(strings.countNum("vi1sh3490"));
		//Counting lower case letters
		System.out.println(strings.countLower("vi1Vsh3490"));
		
	}

}
