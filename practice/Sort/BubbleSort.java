import java.util.*;

public class BubbleSort{
    public void swap(int[] array, int num1, int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
    
    public int[] sort(int[] array){
        int[] copy = array.clone();
        for (int i = copy.length; i > 0; i--){
            for (int j = 0; j < i-1; j++){
                if (copy[j] > copy[j+1]){
                    swap(copy, j, j+1);
                }
            }
        }
        return copy;
    }
    
    public void testSort(){
        int[] arr = {3, 10, 5, 2, 7};
        System.out.println("Sorted array: " + Arrays.toString(sort(arr)));
    }
    
}