package javapracticeprograms;

import java.util.HashMap;

public class Prog1 {

	public static void main(String[] args) {
		String str="suzysimbapluto";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();

		
		int lengthofstring=str.length();
		for(int i=0;i<lengthofstring;i++)
		{
			Character curchar=str.charAt(i);
			if(hmap.containsKey(curchar)==false)
			{
				hmap.put(curchar,1);
			}
			else
			{
				int curfreq=hmap.get(curchar);
				curfreq++;
				hmap.put(curchar, curfreq);
			}
			
		}
		boolean norepeat=false;
		for(int i=0;i<lengthofstring;i++)
		{
			Character curchar=str.charAt(i);
			int curfreq=hmap.get(curchar);
			if(curfreq==1)
			{
				System.out.println(curchar);
				norepeat=true;
				break;
			}
		}
		if(norepeat==false)
		{
			System.out.println(-1);
		}
			

	}

}
