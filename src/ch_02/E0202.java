package ch_02;

import java.util.Scanner;

/**
 * @author Harry G. Dulaney IV
 */
public class E0202 {
	public static void main(String []args) {
		
		double radius;
		double length;
		
		System.out.println("Enter the radius and length of a cylinder");
	
		Scanner input = new Scanner(System.in);
		length = input.nextDouble();
		radius = input.nextDouble();	
		
		double area;
		double volume;
		
		
		area = radius * radius * 3.14159;
		volume = area * length;
		input.close();
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		
		
	}

}
