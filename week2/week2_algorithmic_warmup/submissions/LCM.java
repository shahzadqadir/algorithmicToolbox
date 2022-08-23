import java.util.*;

public class LCM {

  private static long lcm_naive(long a, long b) {
    if (a == 0 || b == 0) {
      return 0;
    }
    long highestNumber = Math.max(a, b);
    long lowestNumber = Math.min(a,  b);
    long lcm = highestNumber;
    while (lcm % lowestNumber != 0) {
      lcm += highestNumber;
    }
    return lcm;
  }  

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
