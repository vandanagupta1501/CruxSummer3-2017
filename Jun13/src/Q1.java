import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the no.");
		int n = scn.nextInt();
		int rv = 0,power=1;
		while (n != 0) {
			
			int rem=n%2;
			n=n/2;
			
			rv=rv+rem*power;
			power=power*10;
		}
		System.out.println(rv);

	}

}
