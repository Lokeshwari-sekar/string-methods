package com.Stringmethods;

public class Equalsmethod 
{

	public static void main(String[] args)
	{
		String s="i love cats";
		String s1=new String("I love Briyani");
		String s2="I love Briyani";
		s.equals(s1);
		s1.equals(s2);
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));

	}

}
