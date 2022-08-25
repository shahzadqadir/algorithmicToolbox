
/**
 * Write a description of class MaxAdRevenue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Arrays;
import java.util.*;

public class MaxAdRevenue
{
    public void maxRevenue(int number, int[] seq1, int[] seq2){ 
        int adder = 0;
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        for (int a : seq1){
            al1.add(a);
        }
        for (int a : seq2){
            al2.add(a);
        }
        while (al1.size() > 0){
            int maxNum1 = Collections.max(al1);
            int maxNum2 = Collections.max(al2);
            adder += (maxNum1 * maxNum2);
            al1.remove(al1.indexOf(maxNum1));
            al2.remove(al2.indexOf(maxNum2));
        }
        System.out.println("Adder: " + adder);
    }
    
    public void createArrayList(){
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        
    }
}
