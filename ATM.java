package Atm_Project;

import java.util.Scanner;

class atm1{
	float Balance;
	int PIN=6362;
	
	public int checkpin() {
		System.out.println("Enter your pin :");
		Scanner sc=new Scanner(System.in);
		int enterpin=sc.nextInt();
		if(enterpin==PIN) {
			menu();
		}else {
			System.out.println("Enter the valide pin");
			
		}
		return enterpin;
		
	}
	
	
	public void menu() {
		System.out.println("Enter your choice :");
		System.out.println("1, check A/C Balance");
		System.out.println("2, Withdraw Money");
		System.out.println("3, Deposit Money");
		System.out.println("4, Exit");
		Scanner sc=new Scanner(System.in);
		int opation=sc.nextInt();
		if(opation==1) {
			checkbalance();
		}else if(opation==2) {
			withdraw();
		}else if(opation==3) {
			deposit();
		}else if(opation==4) {
			return;
		}else {
			System.out.println("Enter valide choice");
		}
	}
	
	
	public void deposit() {
		System.out.println("Enter the deposite balnce :");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		if(a>Balance) {
			Balance += a;
			System.out.println("the amount is deposite succefull :"+Balance);
		}
		menu();
		
	}


	public void checkbalance() {
		System.out.print("balanace :"+Balance);
		menu();
	}
	
	
	public void withdraw() {
		System.out.println("Enter the withdraw Money :");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		if(Balance<a) {
			System.out.println("insufiant balance");
		}else {
			Balance -=a;
			System.out.println("your balance is :"+Balance);
		}
		menu();
		
	}
	
	
}
public class ATM {
	public static void main(String[] args) {
		atm1 a=new atm1();
		a.checkpin();
		
	}

}
