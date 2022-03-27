package com.Stringmethods;

public class SusbstringMethod {

	public static void main(String[] args) {
		String word="Hello everybody Good evening to all";
		word.substring(16);
		System.out.println(word);
		System.out.println(word.substring(16));
		System.out.println("*****************");
		System.out.println(word);
		word.subSequence(0, 16);
		System.out.println(word.subSequence(0, 16));

	}

}
