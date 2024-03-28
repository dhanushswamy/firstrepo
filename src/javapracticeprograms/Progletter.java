package javapracticeprograms;

public class Progletter {

	public static void main(String[] args) {
		String str="dhandeep";
		if(str.matches("[a-zA-Z]+ "))
		{
			System.out.println("string contains letters");
		}
		else
		{
			System.out.println("non letters");
		}
	}

}
