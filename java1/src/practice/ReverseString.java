package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String"); 
		String value =scn.nextLine();
		String reverse="";
		for (int i = value.length()-1; i >=0 ; i--)
		{
			reverse=reverse+ value.charAt(i);
			
		}

		if(value.equals(reverse))
		{
			System.out.println("its a palindrome String");
		}
		else
		{
			System.out.println("Not a palindrome String");
		}
		
		
	}

}
