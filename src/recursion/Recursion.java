package recursion;
/*
 * Write the two recursive methods below, given the instructions that precede
 * each method.  Also look at (and run) the unit tests (RecursionGCDTests and
 * RecursionFastFibonacciTests) if you are using Eclipse and understand unit tests
 * or look at (and run) RecursionGCDMain and RecursionFastFibonacciMain if you
 * do not understand unit tests and/or you are not using Eclipse.
 * 
 */
public class Recursion {
	
	/*
	 * There are multiple algorithms to produce the greatest common divisor
	 * of two integers greater than 0.  
	 * 
	 * One version, which is recursive in nature is defined as follows:
	 * 
	 * gcd(m, n)
	 * 	if (m == n): m
	 *  if (m > n): recursively call gcd with m-n and n
	 *  if (m < n): recursively call gcd with m and n-m
	 *  
	 *  Implement the algorithm above in the method below.  No loops or other
	 *  versions of gcd are allowed and will result in 0 points!  Recursion
	 *  must be used to productively solve the problem or 0 points will be assigned.
	 */
	public static int gcd(int n1, int n2) {
		if(n2 == 0) 
		{
			return n1;
		}
		return gcd(n2,n1%n2);
	}
	

	
/*
 * Fibonacci numbers are a sequence of values defined as follows:
 * 
 * Fibonacci of 0 is by definition 0
 * Fibonacci of 1 is by definition 1
 * 
 * All other Fibonacci values are the result of adding the previous
 * two Fibonacci values together.  Thus the Fibonacci value of 2 is
 * the Fibonacci value of 0 plus the Fibonacci value of 1 which results
 * in 1.  The Fibonacci value of 3 is Fibonacci of 1 plus Fibonacci of 2, which
 * results in 2.
 * 
 * The classic (but incredibly slow - O(2^n) ) recursive solution uses the
 * recurrence:
 * 
 *  Fibonacci(n) = Fibonacci(n-2) + Fibonacci(n-1)
 *  
 *  We can use recursion to produce Fibonacci values much faster than this.
 *  For Fibonacci numbers greater than 1, we need to repetitively calculate
 *  Fibonacci numbers starting at 2 until we reach the desired Fibonacci value
 *  for a specified n.  
 *  
 *  For each recursive call, we simply calculate the current Fibonacci value
 *  by using the previous two Fibonacci values, which are passed as parameters
 *  in the recursive call.  A subsequent recursive call will use the newly 
 *  produced Fibonacci value and the Fibonacci value previous to it.  In addition,
 *  we will want to move to the next Fibonacci number when we make a recursive call.
 *  
 *  Of course we'll stop making recursive calls once the current Fibonacci number
 *  reaches the specified n from the original method call.
 *  
 *  Write the fast version of Fibonacci.  No loops are allowed.  The slow recursive
 *  version is also not allowed. Any code other than the fast recursive version of
 *  Fibonacci will result in 0 points!  Recursion must be used to productively solve
 *  the problem or 0 points will be assigned.
 *  
 *  You are given the public version of the fastFibonacci method.  It includes code
 *  to deal with the base cases of Fibonacci (0 and 1) as well as a commented out call
 *  to a helper method that is the recursive solution.  Uncomment that call, comment out
 *  the return 0 at the end of the method (which was placed there only so the code will
 *  compile), then write the code for the helper method.  The helper method should be
 *  declared private, since something outside this class does not have the proper
 *  information to call it.
 */
	public static long fastFibonacci(long n)
	{
		if(n ==0) // base case
			return 0;
		if(n<=2)
			return 1;
		long fastfib=fastFibonacci(n-2)+fastFibonacci(n-1);
		return fastfib;
		
		//return -1;
	}

	
}// end class
