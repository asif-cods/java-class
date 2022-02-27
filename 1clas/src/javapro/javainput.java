package javapro;

import java.util.Scanner;

public class javainput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INPUT
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number..");
		int num1=scan.nextInt();  //this line will accept a input from the keyboard
		
		System.out.println("please enter another number..: ");
		int num2=scan.nextInt(); //this will accept another number from keyboard
		
		int sum=num1+num2; //process of addition 
		
		System.out.println("the sum of the two numbers is :"+sum); // OUTPUT	
		
	}
	
}
/*
PURPOSE
This program demonstrates how to take input and do a process and give a output
*/