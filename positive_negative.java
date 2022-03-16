package ass;

import java.util.Scanner;

public class positive_negative {
	int a;
	String result;
	
	
	void num()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n1");
		a=s.nextInt();
		String result=a>=0 ? a+ "is a positive number"  :a+ " is a negative number";
	      System.out.println(result);
	}
	
	

	public static void main(String[] args) {
		positive_negative k= new positive_negative();
		k.num();
		
	}

}
