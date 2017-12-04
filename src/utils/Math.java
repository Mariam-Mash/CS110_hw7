//recursion

package utils;
public class Math {
	public static int factorial(int x) {
		if(x <= 1) {
			return 1;
		} else 
		return (x * factorial(x-1));
	}

	//loop
	
public static int factorialLoop (int x) {
		int fact = 1;
		for(int i=1; i<=x; i++) {
			fact = fact*i;
		}
		return fact;
	}
}
