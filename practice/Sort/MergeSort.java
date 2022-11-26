import java.util.*;

public class MergeSort{    
    
    public int[] slice(int[] array, int start, int end){
        ArrayList<Integer> intAl = new ArrayList<Integer>();
        for (int i = start; i < end; i++){
            intAl.add(array[i]);
        }
        return toIntArray(intAl);
    }
    
    public int[] slice(int[] array, int start){
        ArrayList<Integer> intAl = new ArrayList<Integer>();
        for (int i = start; i < array.length; i++){
            intAl.add(array[i]);
        }
        return toIntArray(intAl);
    }
    
    public int[] toIntArray(ArrayList<Integer> input){
        int[] result = new int[input.size()];
        for (int i = 0; i < input.size(); i++){
            result[i] = input.get(i);
        }
        return result;
    }
    
    public int[] merge(int[] ar1, int[] ar2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while ((i < ar1.length) && (j < ar2.length)){
            if (ar1[i] < ar2[j]){
                result.add(ar1[i]);
                i++;
            }
            else {
                result.add(ar2[j]);
                j++;
            }
        }
        while (i < ar1.length){
            result.add(ar1[i]);
            i++;
        }
        while (j < ar2.length){
            result.add(ar2[j]);
            j++;
        }        
        return toIntArray(result);       
    }
    
    public int[] sort(int[] array){
        if (array.length <= 1){
            return array;
        }
        int mid = array.length/2;
        int[] left = sort(slice(array, 0, mid));
        int[] right = sort(slice(array, mid));
        return merge(left, right);
    }
    
    public void testMerge(){
        int[] arr1 = {1, 50, 4, 30, 25, 7};
        System.out.println("Unsorted array: " + Arrays.toString(arr1));
        System.out.println("Sorted array: " + Arrays.toString(sort(arr1)));               
    }
}