public class Fibonacci{
	static int calcFibonacci(int number){
		if (number <= 1) return number;
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		for (int i = 0; i < number-2; i++){
			num1 = num2;
			num2 = sum;
			sum = num1 + num2;
		}
		return sum;
	}

	static int calcWithRecursion(int number){
		if (number > 1){
			return calcWithRecursion(number -1) + calcWithRecursion(number - 2);
		}
		return number;
	}

	static int efficientFabonacci(int number){		
		if (number > 1){
			int [] numbers = new int [number+1];
			numbers[0] = 0;
			numbers[1] = 1;
			for (int i = 2; i <= number; i++){
				numbers[i] = numbers[i-1] + numbers[i-2];
			}
			return numbers[number];
		}

		return number;
	}

	public static void main(String args[]){
		System.out.println("20th Fibonacci number is: "+ efficientFabonacci(50));
		System.out.println("5th Fibonacci number is (without Recurssion): "+ calcFibonacci(50));
	}
}