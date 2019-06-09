package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number=JOptionPane.showInputDialog("Give me a number");
		int integer=Integer.parseInt(number);
		int factors=0;
		for(int i=2;i<integer;i++) {
			if(integer%i==0) {
				factors+=1;
			}
		}
		if(factors==0) {
			JOptionPane.showMessageDialog(null,"Your number is prime");
		}
		else {
			JOptionPane.showMessageDialog(null,"Your number isn't prime");
		}
	}
}
