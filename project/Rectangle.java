package project;

import java.util.Scanner;

 class Rectangle extends Shape{

	private float length;
	private float breath;
	public void acceptInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		length=sc.nextFloat();
		System.out.println("Enter the breadth of rectangle: ");
		breath=sc.nextFloat();
	}
	public void compute() {
		area=length*breath;
	}
}
