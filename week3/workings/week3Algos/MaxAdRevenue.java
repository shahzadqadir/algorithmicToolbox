
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
        for (int a : seq1){
            al1.add(a);
        }
        while (al1.size() > 0){
            int maxNum = Collections.max(al1);
            adder += maxNum;
            al1.remove(al1.indexOf(maxNum));
        }
        System.out.println("Adder: " + adder);
        System.out.println("al1 now is: " + al1.toString());
    }
    
    public void createArrayList(){
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        
    }
}
