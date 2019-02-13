package restaurantBill;

import javax.swing.JOptionPane;

public class RestaurantBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double tax;
		double tip;
		double total;
		String charge;
		int money;
		
		charge = JOptionPane.showInputDialog("Enter the charge for your meal:  ");
		
		money = Integer.parseInt(charge);
		tax = money * 0.05;
		tip = money * 0.10;
		total = money + tax + tip;
		
		JOptionPane.showMessageDialog(null,  "Meal charge:  " + charge + 
				".//n Your tax amount:  " + tax + 
				".//n Tip Amount:  " + tip + 
				".//n Total:  " + total );

	}
}
