import java.util.*;
import java.math.BigInteger;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n > 1) {
            BigInteger[] numbers = new BigInteger[n+1];
            numbers[0] = BigInteger.ZERO;
            numbers[1] = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                numbers[i] = numbers[i-1].add(numbers[i-2]);
            }
            return numbers[n].remainder(BigInteger.TEN).intValue();
        }
        return n % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}



public class FibonacciLastDigit {
    public static int calc_fib(int n) {
        
    }
    
    public static void main(String[] args) {
        System.out.println("50th Fibonnaci number is: " + calc_fib(237));
    }
}
