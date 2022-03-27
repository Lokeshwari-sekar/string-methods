package com.Stringmethods;

public class Containsmethod
{

	public static void main(String[] args)
	{
		String s1="I am learning Java Language";
		String s2="learning";
		String s3="Learning";
		String s4="Language";
		s1.contains(s2);
		s1.contains(s3);
		s1.contains(s4);
		System.out.println(s1.contains(s2));
		System.out.println(s1.contains(s3));
		System.out.println(s1.contains(s4));

	}

}
