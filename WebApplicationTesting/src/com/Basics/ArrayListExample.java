package com.Basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args)
	{
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		List<String>a = new ArrayList<>();
		a.add("Hello");
		a.add("Ash");
		a.add("Hi");
		a.add("pollo");
		a.add("chello");
		
		/*System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));*/
		
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		

	}

}
