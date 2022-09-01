package projects;

import java.util.Scanner;


public class volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//start to compile
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double l = input.nextDouble();
		
		System.out.print("Enter width: ");
		double w = input.nextDouble();
		
		System.out.print("Enter height: ");
		double h = input.nextDouble();
		
		
		double volume = l * w * h;
		
		
		System.out.println("volume = " + volume);
	}//end main

}//end class
