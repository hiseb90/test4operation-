package test4operation;

import java.util.Scanner;

public class Calcule {
	public static void main(String args[]){
		System.out.println("hello world");
		//declare input system for user
		Scanner keyb=new Scanner(System.in);
		//declare value of menu or number of choice
		String valOfMenu="h";
		//while valOfMenu is different to q display this menu
		while((valOfMenu.charAt(0))!='5'){
			System.out.println("-----Menu of Operation Arithmetic---");
			System.out.println("1--Add ");
			System.out.println("2--Subtract");
			System.out.println("3--Divide");
			System.out.println("4--Multiplication");
			System.out.println("5-Exit");
			System.out.println("Please choose one of the selection:");
			valOfMenu=keyb.next();
			
			switch(valOfMenu.charAt(0)){
			
			case '1' :
				System.out.println("----Please Enter your inputs here----");
				System.out.println("Please Enter your First Number:");
				int firstValue = keyb.nextInt();
				System.out.println("Please Enter your second number:");
				int secondValue = keyb.nextInt();
				int result = adding(firstValue,secondValue);
				System.out.println("the result of the operation is :" + result);
				break;
			
			case '2':
				System.out.println("----Please Enter your inputs here----");
				System.out.println("Please Enter your First Number:");
				int FirstValue = keyb.nextInt();
				System.out.println("Please Enter your second number:");
				int SecondValue = keyb.nextInt();
				int result1 = subtracting(FirstValue,SecondValue);
				System.out.println("the result of the operation is :" + result1);
				break;
			
			case '3':
				System.out.println("----please Enter your inouts here---");
				System.out.println("Please Enter your first Number:");
				int FirstValue1 = keyb.nextInt();
				System.out.println("Please enter your second number:");
				int SecondValue1 = keyb.nextInt();
				int result2 = division(FirstValue1,SecondValue1);
			    System.out.println("The result if the operation is :" +result2);
			    break;
			
			case '4':
				System.out.println("----please Enter your inouts here---");
				System.out.println("Please Enter your first Number:");
				int FirstValue2 = keyb.nextInt();
				System.out.println("Please enter your second number:");
				int SecondValue2 = keyb.nextInt();
				int result3 = multiplication(FirstValue2,SecondValue2);
			    System.out.println("The result if the operation is :" +result3);
			    break;
			    
			case '5':
				System.out.println("bye bye baby");
				System.exit(0);
				break;
			
			default: 
				System.out.println("Error Message");
			}
			
			
			
		}
		
		
	
	}
	
	 //function for add two numbers
	static int adding(int a,int b){
		return a+b;
		
	}
//function for subtracting two number	
	static int subtracting(int a,int b){
		return a-b;
	}
	
	//two functions for multiplication and division
	static int division(int a,int b){
		return a/b;
	}
	static int multiplication(int a,int b){
		return a*b;
	}
	
}
