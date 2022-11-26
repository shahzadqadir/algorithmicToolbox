import java.util.*;

public class FibonacciNumbers{
    private HashMap<Integer, Long> existing = new HashMap<Integer, Long>(); 
    
    public long fib(int n){
        /*Do not try for numbers higher than 30*/
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public int search(ArrayList<Integer> ar, int num){
        for (int i = 0; i < ar.size(); i++){
            if (ar.get(i) == num){
                return i;
            }
        }
        return -1;
    }
    
    public long fib2(int n){
        ArrayList<Integer> keys = new ArrayList<Integer>();
        for (Integer key : existing.keySet()){
            keys.add(key);
        }
        if (search(keys, n) == -1){
            if (n <= 1){
                existing.put(n, (long)n);
            }
            else {
                existing.put(n, (fib2(n-1) + fib2(n-2)));                
            }
        }
        return existing.get(n);   
    }
    
    public long fib3(int n){
        long[] numbers = new long[n+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < n+1; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        //System.out.println(Arrays.toString(numbers));
        return numbers[n];
    }
    
    public long fib4(int n){        
        long previous = 0;
        long current = 1;
        for (int i = 2; i < n+1; i++){
            long new_current = previous + current;
            previous = current;
            current = new_current;
            //current = new_current + current;
        }
        return current;
    }
    
    public void testFibonacci(){
        int n = 35;
        System.out.println("Fibonacci number for " + n + " using array method: " + fib3(n));
        System.out.println("Fibonacci number for " + n + " using addition method: " + fib4(n));
    }
}