package lab01;

import java.util.*;
public class SumNums {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		String line;
		int start, end;
		while(true){
			System.out.println("Starting number: ");
			start=scanner.nextInt(); 
			System.out.println("Ending number: ");
			end=scanner.nextInt();
			int sum=0;
			// You have something to fix here!
			System.out.println("The sum from "+start+ " to "+ end + " is: "+ sum);
		}
	}

	// Create static method sumup(s,e) which returns the sum s+(s+1)+...+(e-1)+e
	// or 0 if this sum does not make sense (ie sumup(3,-4)).
}
