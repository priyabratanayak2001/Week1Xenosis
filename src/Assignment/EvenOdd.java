package Assignment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		 int  num=sc.nextInt();
		 
		 if(num%2==0)
		 {
			 System.out.println(num+" "+ "num is even");
		 }
		 else
		 {
			 System.out.println(num+" "+"num is odd"); 
		 }
		   
	}

}
