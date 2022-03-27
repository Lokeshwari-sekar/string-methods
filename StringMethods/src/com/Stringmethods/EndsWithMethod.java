package com.Stringmethods;

public class EndsWithMethod
{

	public static void main(String[] args) 
	{
		String statement="I love tea more than coffee";
		String word1="coffee";
		String word2="Coffee";
		String word3="more than coffee";
		statement.endsWith(word1);
		statement.endsWith(word2);
		statement.endsWith(word3);
		System.out.println(statement.endsWith(word1));
		System.out.println(statement.endsWith(word2));
		System.out.println(statement.endsWith(word3));
	}

}
