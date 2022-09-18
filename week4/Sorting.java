import java.util.*;

public class Sorting{
    
    public void swap(int[] array, int num1, int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
    
    public int getMinIndex(int[] array, int from){
        int indx = from;
        for (int i = from+1; i < array.length; i++){
            if (array[i] < array[indx]){
                indx = i;
            }
        }
        return indx;
    }
    
    public int[] bubbleSort(int[] array){
        for (int i = array.length; i > 0; i--){
            for (int j = 0; j < i - 1; j++){
                if (array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }
    
    public int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i ++){
            int minIndex = getMinIndex(array, i);
            if (array[i] > array[minIndex]){
                swap(array, i, minIndex); 
            }
        }
        return array;
    }
    
    public static void main(String[] args){
        // test bubble sort
        int [] ar1 = {3, 1, 6, 4, 10, 15};
        Sorting sr = new Sorting();
        //System.out.println(Arrays.toString(bubbleSort(ar1)));
        System.out.println("Original array: " + Arrays.toString(ar1));
        System.out.println("Sorted aray: " + Arrays.toString(sr.selectionSort(ar1)));
    }
}