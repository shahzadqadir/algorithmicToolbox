import java.util.*;

public class DotProduct {
    private static long maxDotProduct(int[] a, int[] b) {        
        long result = 0;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for (int num : a){
            al1.add(num);
        }
        for (int num : b){
            al2.add(num);
        }
        while (al1.size() > 0){
            int maxNum1 = Collections.max(al1);
            int maxNum2 = Collections.max(al2);
            result += (long)maxNum1 * (long)maxNum2;
            al1.remove(al1.indexOf(maxNum1));
            al2.remove(al2.indexOf(maxNum2));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
    }
}

