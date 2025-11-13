// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		String numero = args[0]; // get starting number
		int number = Integer.parseInt(numero); 
		int seed = 1; // starting seed to count until number
		
		for(seed = 1; seed <= number; seed++) { // loop from 1 to number
			int counter = 1; 
		    System.out.println(); // new line for each seed
			System.out.print(seed + " "); // print starting seed
			int currentNumero = seed; // current number in the sequence
		while (currentNumero != 1) {
		  if (currentNumero % 2 == 0) { // even
			  currentNumero /= 2;
			  System.out.print(currentNumero + " " );}
			else {
			  currentNumero = 3 * currentNumero + 1; // odd
			  System.out.print(currentNumero + " ");
		       
			} 
             counter++; // count the steps
	    }
		   System.out.print("(" + counter + ")");


	}
	} 
}
