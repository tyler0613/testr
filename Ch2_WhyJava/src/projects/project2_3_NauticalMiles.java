package projects;

import java.util.Scanner;

public class project2_3_NauticalMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter kilometers: ");
		double num = reader.nextDouble();
		
		double nautical = num * 0.53993;
		
		
		System.out.println("Nautical Mile: " + nautical);
		
	
	
	
	}//end main

}//end class
