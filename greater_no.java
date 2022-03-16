package ass;

import java.util.Scanner;

public class greater_no {
	
	
	void input()
	{
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the A=");
		a=s.nextInt();
		System.out.print("Enter the B=");
		b=s.nextInt();
		if (a>b) {
			System.out.print("A is greater than B");
				}
		else 
		{
			System.out.print("B is greater than A");
		}
		
	}
	public static void main(String[] args) {
		
		greater_no k= new greater_no();
		k.input();
		}
	}
