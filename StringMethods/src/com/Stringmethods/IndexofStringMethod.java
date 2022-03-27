package com.Stringmethods;

public class IndexofStringMethod
{

	public static void main(String[] args)
	{
		String text="I am leaning java course";
		//here we are using the only parameter is string
	System.out.println("here we are using the only parameter is string");
		text.indexOf("java");
		System.out.println(text.indexOf("java"));
		
	
		String text1="welcome to tamilnadu, welcome to india ";
	//herre we are using two parameters they are string and index from value	
	System.out.println("here we are using two parameters they are string and index from value");
		text.indexOf("welcome",8);
		text.indexOf("to", 11);
		System.out.println(text1.indexOf("welcome",8));
		System.out.println(text1.indexOf("to", 11));
		
	}

}
