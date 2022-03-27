package com.Stringmethods;

public class ConcatMethod 
{
	public static void main(String[] args) 
	{
		//variables declaration and declaration
		String firstcomment="Hello";
		String secondcomment="World";
		
		//this method is used to concatenation of two strings 
		firstcomment.concat(secondcomment);
		
		//print statement
		System.out.println(firstcomment.concat(" "+secondcomment));
		System.out.println(secondcomment.concat(" "+firstcomment));

	}
}
