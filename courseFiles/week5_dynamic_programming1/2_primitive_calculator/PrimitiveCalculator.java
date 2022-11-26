import java.util.*;

public class PrimitiveCalculator {
  public static int count = 0;
  public static List<Integer> sequence = new ArrayList<Integer>();

  private static List<Integer> optimal_sequence(int n) {
      //sequence.add(n);
      //int number = n;
      if (n <= 1) {
        //sequence.add(n);
        return sequence;
      }
        if (n % 5 == 0){
            n -= 1;
            count++;
            sequence.add(n);
        }
        if (n % 3 == 0){
            count ++;
            n /= 3;
            sequence.add(n);
        }
        else if (n % 2 == 0){
            count ++;
            n /= 2;
            sequence.add(n);
        } else {
            n -= 1;
            count++;
            sequence.add(n);
        }
        //sequence.add(n);
        //System.out.println(sequence);
        optimal_sequence(n);
        //sequence.add(n);
        //return count;
      Collections.reverse(sequence);
      return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        sequence.add(n);
        System.out.println(count);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
        System.out.println("\n");
    }
}
