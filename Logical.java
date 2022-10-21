package demo;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a value");
		value=Sc.nextInt();
		if((value>=10)&&(value%2==0))
		{
			System.out.println("value.10 and even");
			
		}
		else
		{
			System.out.println("conditions not met");
		}
		
		

	}

}
