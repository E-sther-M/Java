package studentFees;

import java.util.Scanner;

public class StudentFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double tFees, total, creditHours, credit, totalFees, price;
		
		System.out.print("How many credit hours are you enrolled in?  ");
		creditHours = input.nextDouble();
		
		System.out.print("How much did you spend on books?  ");
		price = input.nextDouble();
		
		totalFees = (800 * 60) + price + 600;
		
		credit = 800/creditHours;
		System.out.println("Credit: " + credit);
		
		tFees = creditHours + 800;
		System.out.println("Tuition Fees: " + tFees);
		
		total = price + 600 + totalFees;
		System.out.println("Total: " + total);

	}

}
