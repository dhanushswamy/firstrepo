package javapracticeprograms;

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {
//		String str="susysimbapluto";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j] && ch[i]!= ' ')
				{
					count++;
				}
				
			}
			if(count>1 && ch[i]!='0')
			{
				System.out.println(ch[i]);
			}
		}
	}
}
			
		
