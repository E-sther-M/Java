package celsius;

import java.util.Scanner;

public class Celsius {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		double fahrenheit;
		double celsius;
		
		System.out.print("Enter temperature in fahrenheit:  ");
		fahrenheit = kb.nextDouble();
		
		celsius = 5.0/9.0 * (fahrenheit - 32);
		System.out.println("Temperature in fahrenheit:  " + fahrenheit);
		System.out.println("Temperature in celsius:  " + celsius);
		
	}
}
