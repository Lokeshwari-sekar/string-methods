package com.Stringmethods;

public class equalsIgnoreCaseMethod 
{

	public static void main(String[] args)
	{
		String song="i love songs";
		String song1="I love songs";
		String dance="I love dance";
		String dance1="i love dance";
		song.equalsIgnoreCase(song1);
		song1.equalsIgnoreCase(dance1);
		System.out.println(song.equalsIgnoreCase(song1));
		System.out.println(dance.equalsIgnoreCase(dance1));
	}

}
