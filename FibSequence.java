import acm.program. *;
/*This program print out Fibonacci sequence my adding first two 
numbers to get the third one, adds 2nd and 3rd number to get the forth one
and so on. It stops at or before it reached maximum term value set constant in program.*/

public class FibSequence extends ConsoleProgram {
	
	private static final int MAX_TERM_VALUE = 10000;
	private int term1 = 0;
	private int term2 = 1;
	
	
	public void run() {
		int term = 0;
		int counter = 0;
		
		println("This program lists the Fibonacci sequence.");
		
		
		while (term <= MAX_TERM_VALUE) {
			if (counter != 0) println (term);
				term = Fib (counter);
				counter++;
			}
		
	}
	
	private int Fib (int index) {
	//Adds previous two terms and stores in third term and so on 	
		if (index == 0) {
			return term1;
			} else if (index == 1) {
					return term2;
				}else {
					int temp = term1 + term2;
					term1 = term2;
					term2 = temp;
					return temp;
					}
		}
	

}