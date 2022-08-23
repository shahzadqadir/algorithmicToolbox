import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
  if (a == b) {
    return a;
  }
  if ((a == 1) || (b == 1)) {
    return 1;
  }
  if (a % b == 0) {
    return b;
  }
  if (b % a == 0) {
    return a;
  }
  
    int gcd = 0;
    int number1 = a, number2 = b; 
    if (b > a) {
      number1 = b;
      number2 = a;
    }
    
    while (true) {
      if (number1 % number2 != 0) {
        gcd = (int) number1 % number2;
        number1 = number2;
        number2 = gcd;        
      } else {
          return gcd;
      }
    }
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
