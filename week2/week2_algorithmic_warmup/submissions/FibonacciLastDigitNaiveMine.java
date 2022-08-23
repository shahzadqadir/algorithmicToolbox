import java.util.*;
import java.math.BigInteger;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n > 1) {
            BigInteger[] numbers = new BigInteger[3];
            numbers[0] = BigInteger.ZERO;
            numbers[1] = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                numbers[2] = numbers[1].add(numbers[0]);
                numbers[0] = numbers[1];
                numbers[1] = numbers[2];
            }
            return numbers[2].remainder(BigInteger.TEN).intValue();
        }
        return (int)n % 10;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}