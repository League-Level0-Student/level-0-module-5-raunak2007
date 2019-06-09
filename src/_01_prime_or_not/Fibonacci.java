package _01_prime_or_not;

public class Fibonacci {
	public static void main(String[] args) {
		int f=0;
		int s=1;
		int t;
		System.out.println(f);
		for(int i=0;i<12;i++) {
			t=f+s;
			f=s;
			s=t;
			System.out.println(f);
		}
		
				
	}
}
