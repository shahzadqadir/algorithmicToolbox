import java.util.*;
import java.io.*;
import java.util.Random;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers){
        long maxFirst = 0, maxSecond = 0;
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > maxFirst) {
                maxFirst = numbers[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < numbers.length; i++){
            if ((i != maxIndex) && (numbers[i] > maxSecond)){
                maxSecond = numbers[i];
            }
        }
        return maxFirst * maxSecond;
    }

    // static void testGetMaxPairwiseProduct(){
    //     Random rand = new Random();
        
    //     double[] testArray = new double[5];
    //     for (int i = 0; i < testArray.length; i++){
    //         testArray[i] = rand.nextDouble() * 100;
    //     }
    //     for (double num : testArray){

    //         System.out.print(num + " ");
    //     }
    //     System.out.println();
    //     long beforeRunTime = System.nanoTime();
    //     System.out.println(getMaxPairwiseProduct(testArray));
    //     long afterRunTime = System.nanoTime();
    //     System.out.println("Time elapsed: " + (afterRunTime - beforeRunTime));
    // }

    public static void main(String[] args) {

        
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
        
        //testGetMaxPairwiseProduct();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
