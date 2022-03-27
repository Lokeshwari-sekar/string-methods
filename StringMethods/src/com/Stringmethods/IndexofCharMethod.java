package com.Stringmethods;

public class IndexofCharMethod
{

	public static void main(String[] args)
	{
		String text="Everything is happen for a reason";
		
		//here the char is only parameter
		System.out.println("here the char is only parameter");
		text.indexOf('E');
		text.indexOf('e');
		System.out.println(text.indexOf('E'));
		System.out.println(text.indexOf('e'));
		
		System.out.println("******************");
		
		
		//here the char and from index are two parameter are using
		System.out.println("here the char and from index are two parameter are using");
		text.indexOf('e',11);
		text.indexOf('e',21);
		System.out.println(text.indexOf('e',11));
		System.out.println(text.indexOf('e',21));

	}

}
