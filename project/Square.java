package project;

import java.util.Scanner;

 class Square extends Shape{
   private float length;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of square: ");
		length=sc.nextFloat();
	}
	public void compute()
	{
		area=length*length;
	}
    
}
