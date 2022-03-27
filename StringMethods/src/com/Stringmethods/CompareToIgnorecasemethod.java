package com.Stringmethods;

public class CompareToIgnorecasemethod 
{

	public static void main(String[] args) 
	{
		//variables declaration and initialization
		
		String category1="Hello world";
		String category2="hello world";
		String category3="world";
		String category4="World";
		
		//this method is used to compare two string character unicode values.
		//but here the case are ignored.
		
		category1.compareToIgnoreCase(category2);
		
		//print statement 
		
		System.out.println(	category1.compareToIgnoreCase(category2));
		System.out.println(	category2.compareToIgnoreCase(category3));
		System.out.println(	category2.compareToIgnoreCase(category4));
		System.out.println(	category3.compareToIgnoreCase(category1));
		System.out.println(	category3.compareToIgnoreCase(category4));
		System.out.println(	category4.compareToIgnoreCase(category1));
		
	}

}
