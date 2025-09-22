package raju;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 int nValues = 50;

	        outer: // label for the outer loop
	        for (int i = 2; i <= nValues; i++) {
	            int maxDivisor = (int)Math.sqrt(i);

	            for (int j = 2; j <= maxDivisor; j++) {
	                if (i % j == 0) {
	                    // Not prime → skip to next i
	                    continue outer;
	                }
	            }

	            // If we reach here, no divisors found → prime
	            System.out.println(i);
	        }
		

	}

}
