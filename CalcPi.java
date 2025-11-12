public class CalcPi {
	public static void main(String [] args) {
    String howManyTerms = args[0]; // get number of terms
	int terms = Integer.parseInt(howManyTerms);
	int denominator = 1; 
	int sign = 1;
	double pi = Math.PI;
	double sum = 0.0;	
	for (int i = 0; i < terms; i++) {
		sum += sign * (1.0 / denominator);
		sign *= -1;
		denominator +=2 ;
		
	}
	System.out.println("pi according to java: " + pi);
	System.out.println("pi, approximated:     " + sum * 4 );
  }
} 
