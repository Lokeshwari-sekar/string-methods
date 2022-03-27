package com.Stringmethods;

public class JoinMethod
{

	public static void main(String[] args)
	{
		String statement1="Hello everyone how are you";
		
		String statement2=String.join("-","Hello","everyone","how","are","you");
		String statement3=String.join(" ","Hello","everyone","how","are","you");
		System.out.println(statement1);
		System.out.println("**************");
		System.out.println(statement2);
		System.out.println(statement3);
	}

}
