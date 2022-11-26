import java.util.*;

public class Sort{
    
    public void swap(int[] array, int num1, int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;        
    }
    
    public int[] bubbleSort(int[] array){
        int[] copy = array.clone();
        for (int i = 0; i < copy.length; i++){
            for (int j = 0; j < copy.length - 1; j++){
                if (copy[j] > copy[j+1]){
                    // int temp = copy[j];
                    // copy[j] = copy[j+1];
                    // copy[j+1] = temp;
                    swap(copy, j, j+1);
                }
            }
        }
        return copy;
    }
    
    public int[] insertionSort(int[] array){
        int[] copy = array.clone();
        for (int i = 0; i < copy.length; i++){
            int currentVal = copy[i];
            int j = 0;
            for (j = i-1; j >= 0 && (copy[j] > currentVal); j--){
                copy[j+1] = copy[j];
            }
            copy[j+1] = currentVal;
        }
        return copy;
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
    
    public int[] selectionSort(int[] array){
        int[] copy = array.clone();
        for (int i = 0; i < copy.length; i++){
            int minIndex = getMinIndex(copy, i);
            if (copy[minIndex] < copy[i]){
                // int temp = copy[i];
                // copy[i] = copy[minIndex];
                // copy[minIndex] = temp;
                swap(copy, minIndex, i);
            }
        }        
        return copy;
    }
    
    public void testSort(){
        int[] ar1 = {3, 1, 7, 4, 23, 6};
        System.out.println("Before bubble sort " + Arrays.toString(ar1));
        System.out.println("Sorted array after bubble sort: " + Arrays.toString(bubbleSort(ar1)));
        System.out.println("After bubble sort " + Arrays.toString(ar1));
    }
}