import java.util.*;

public class MergeSort{
    
    public int[] alToArray(ArrayList<Integer> ar){
        int[] result = new int[ar.size()];
        for (int i = 0; i < ar.size(); i++){
            result[i] = ar.get(i);
        }
        return result;
    }   
    
        public int[] mergeArrays(int[] ar1, int[] ar2){
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
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
        
        return alToArray(result);
    }
    
    public int[] slice(int[] ar, int start, int end){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++){
            result.add(ar[i]);
        }
        return alToArray(result);
    }
    public int[] slice(int[] ar, int start){
        return slice(ar, start, ar.length);
    }
    
    public int[] sort(int[] arr){
        if (arr.length <= 1){
            return arr;
        }
        //int middle = arr.length/2;
        int[] left = sort(slice(arr, 0, arr.length/2));
        int[] right = sort(slice(arr, arr.length/2));
        return mergeArrays(left, right);
    }
    
    public void testAlToArray(){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        int[] ar = alToArray(al);
        System.out.println(al.getClass());
        System.out.println(ar.getClass().getName());
        
    }
    
    public void testMergeArrays(){
        int [] ar1 = {1, 3, 5, 7};
        int [] ar2 = {2, 4, 6, 8, 10};
        System.out.println("Merged arrays are: " + Arrays.toString(mergeArrays(ar1, ar2)));
    }
    
    public void testSort(){
        int[] ar = {10, 4, 8, 3, 1, -20, 7};
        System.out.println("sorted? " + Arrays.toString(sort(ar)));
    }
}