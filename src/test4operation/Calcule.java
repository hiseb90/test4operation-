package test4operation;

import java.util.Scanner;

public class Calcule {
	public static void main(String args[]){
		System.out.println("hello world");
		//declare input system for user
		Scanner keyb=new Scanner(System.in);
		//declare value of menu or number of choice
		int valOfMenu=0;
		//while valOfMenu is different to q display this menu
		while(valOfMenu!=5){
			System.out.println("-----Menu of Operation Arithmetic---");
			System.out.println("1--Add ");
			System.out.println("2--Subtract");
			System.out.println("3--Divide");
			System.out.println("4--Multiplication");
			System.out.println("5-Exit");
			System.out.println("Please choose one of the selection:");
			valOfMenu=keyb.nextInt();
			
			
			
			
			
		}
		
		
	
	}
	 //function for add two numbers
	static int adding(int a,int b){
		return a+b;
		
	}
	
	
}
