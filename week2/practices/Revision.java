import java.util.Random;

public class Revision{

	static double fabonacci(int number){
		double[] numbers = new double[number + 1];
		if (number < 2) {
			return number;
		}
		numbers[0] = 0;
		numbers[1] = 1;
		for (int i = 2; i <= number ; i++){
			numbers[i] = numbers[i-1] + numbers[i-2];
		}
		return numbers[number];
	}

	static double gcn(double number1, double number2){
		double a = number1;
		double b = number2;
		double c = 0.0;
		while (a % b != 0){
			c = a % b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String [] args){
		Random rand = new Random();

		System.out.println("fabiconni number for 100th position is: " + fabonacci(20));

		for (int i = 0; i < 50; i++){
			double num1 = (double) rand.nextInt(10000);
			double num2 = (double) rand.nextInt(10000);
			System.out.println("Greatest Common Divisor for " + num1 + " and " + num2 + " is: " + gcn(num1, num2));
		}

	}
}