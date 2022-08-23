public class GCD{
	/*
	* Calculate greatest common divisor
	* GCD is the greatest number that divides both given numbers
	*/
	public static double getGCD(double number1, double number2){
		double best = 0;
		double iterations = 0.0;
		if (number1 > number2) {
			iterations = number1;
		} else{
			iterations = number2;
		} 

		for (double i = 0; i < iterations; i++){
			if ((number1 % i == 0) && (number2 % i == 0)){
				best = i;
			}
		}
		return best;
	}

	public static double getGCDByPrime(double num1, double num2){
		double a;
		double b;
		double c;
		if (num1 > num2){
			a = num1;
			b = num2;
		} else {
			a = num2;
			b = num1;
		}

		//System.out.println("A divided by B remainder is: " + (a%b));

		while (true){
			if ((a % b) != 0){
				System.out.println(b);
				c = b;
				b = a % b;
				a = c;		
				System.out.println(b);
			}
			return c;
		}

	}

	public static void main(String[] args){
		double num1 = 357;
		double num2 = 234;
		System.out.println("Greatest Common Divisor for " + 
			num1 + " and " + num2 + " is: " + getGCD(num1, num2));
		System.out.println("Using second method: " + getGCDByPrime(num1, num2));
	}
}