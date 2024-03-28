package javapracticeprograms;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	
	if(str.equals(rev))
		System.out.println("palindrome");
	else
		System.out.println("not a pallindromea");
	}
}
