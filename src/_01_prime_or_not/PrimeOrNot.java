package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number=JOptionPane.showInputDialog("Give me a number");
		int integer=Integer.parseInt(number);
		for(int i=2;i<integer;i++) {
			if(integer%i==0) {
				JOptionPane.showMessageDialog(null,"You're number isn't prime");
			}
			else {
				JOptionPane.showMessageDialog(null,"You're number is prime");
			}
		}
	}
}
