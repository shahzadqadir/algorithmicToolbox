import java.util.*;

public class SelectionSort{
    
    public int getMinIndex(int[] array, int from){
        int indx = from;
        for (int i = from+1; i < array.length; i++){
            if (array[i] < array[indx]){
                indx = i;
            }
        }
        return indx;
    }
    
    public void swap(int[] array, int num1, int num2){
        // array is passed by refernece, not returning anything but changing original array.
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
    
    public int[] sort(int[] array){
        //go through array numbers one by one
        //if current number is greater than then minimum number in array, then swap
        for (int i = 0; i < array.length; i++){
            int minIndex = getMinIndex(array, i);
            if (array[i] > array[minIndex]){
                swap(array, i, minIndex);
            }
        }
        return array;
    }
    
    public void test(){
        int[] arr = {10, 7, 4, 1, 8, 2, 3};
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        System.out.println("Selection Sort: " + Arrays.toString(sort(arr)));
    }
}