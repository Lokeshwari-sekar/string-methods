package com.Stringmethods;

public class StartswithMethod
{

	public static void main(String[] args)
	{
		String word="Hello everybody good evening to all";
		word.startsWith("Hello");
		word.startsWith("everybody");
		word.startsWith("Hello everybody good evening");
		
		
		System.out.println(word.startsWith("Hello"));
		System.out.println(word.startsWith("everybody"));
		System.out.println(word.startsWith("Hello everybody good evening"));

	}

}
