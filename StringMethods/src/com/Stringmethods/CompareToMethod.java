package com.Stringmethods;

public class CompareToMethod
{

	public static void main(String[] args)
	{
		//variables declaration and 
		String statement1="Hello friends";
		String statement2="Hello friends";
		String statement3="Hello";
		String statement4="Word";
		
		//this method is used to compare two statement characters unicode value
		statement1.compareTo(statement2);
		
		//print statement
		System.out.println(	statement1.compareTo(statement2));
		System.out.println(	statement2.compareTo(statement1));
		System.out.println(	statement3.compareTo(statement1));
		System.out.println(	statement3.compareTo(statement4));
		System.out.println(	statement4.compareTo(statement3));

	}

}
