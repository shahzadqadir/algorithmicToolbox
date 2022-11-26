import java.util.*;

public class LinearSearch{
    public int searchString(String[] strArray, String key, boolean ignorecase){
        /*
         * Takes a strings array and key. Search key within array, 
         * if found return index otherwise return -1
         */
        for (int i = 0; i < strArray.length; i++){
            if (ignorecase){
                if (strArray[i].toLowerCase().equals(key.toLowerCase())){
                    return i;
                }
            }
            if (strArray[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(int[] numbers, int key){
        /*
         * Search an array of integers, return index if found else return -1
         */
        int startIndex = 0;
        int endIndex = numbers.length;
        for (int i = 0; i < numbers.length; i++){
            int middle = Math.round((startIndex + endIndex)/2);
            if (numbers[middle] == key){
                return middle;
            }
            else if (numbers[middle] > key){
                endIndex = middle;
            }
            else {
                startIndex = middle;
            }
        }
        return -1;
    }
    
    public void testBinary(){
        LinearSearch ls = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int result = ls.binarySearch(arr, 12);
        System.out.println(result);
    }
    public static void main(String[] args){
        LinearSearch ls = new LinearSearch();
        String[] ar = {"Shahzad", "Qadir Baksh", "bilal", "Hamza"};
        String key = "Bilal";
        if (ls.searchString(ar, key, false) != -1){
            System.out.println(key + " found at index: " + ls.searchString(ar, key, false));
        }
        else {
            System.out.println(key + " not found");
        }
    }
}