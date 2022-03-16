package ass;

import java.util.Scanner;



public class DISCOUNT {
	String name;
	int price;
	
	
	void input() {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the name");
		name=s.next();
		System.out.println("Enter the price");
		price=s.nextInt();
	}
	void show () {
		System.out.println("Name the product="+name);
		System.out.println("Name the price="+price);
		//System.out.println("Name the quality="+quality);
	}
	void calculate() {
		if(price>2000)
		{
			System.out.println("Getting 10% discount");
			
	}
		else
		{
			System.out.println("Getting 7% discount");
		}
	}
	public static void main(String[] args)
	{
		DISCOUNT k=new DISCOUNT();
		k.input();
		//k.show();
		k.calculate();
		
	}

}
