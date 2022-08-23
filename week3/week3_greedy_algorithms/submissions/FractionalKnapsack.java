import java.util.Scanner;
import java.util.ArrayList;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
      ArrayList<Integer> vals = convertToAL(values);
      ArrayList<Integer> weighs = convertToAL(weights);
      double totalVal = 0.0000;
      while ((capacity > 0) && (vals.size() > 0)) {
        int indx = getMaxValueIndex(vals, weighs);
        int weight = weighs.get(indx);
        int value = vals.get(indx);
        if (weight <= capacity) {
          totalVal += value;
          capacity -= weight;
          weighs.remove(indx);
          vals.remove(indx);
        } else {
          totalVal += capacity * ((double)value/(double)weight);
          return totalVal;
        }
      }
      return totalVal;
    }

    private static int getMaxValueIndex(ArrayList<Integer> values, ArrayList<Integer> weights) {
  		int maxIndex = 0;
  		double maxValue = 0.0;
  		for (int i=0; i < values.size(); i++) {
  			double currentValue = (double)values.get(i)/(double)weights.get(i);
  			if (currentValue > maxValue){
  				maxValue = currentValue;
  				maxIndex = i;
  			}
  		}
  		return maxIndex;
  	}

  	private static ArrayList<Integer> convertToAL(int[] intArray){
          ArrayList<Integer> abcList = new ArrayList<>();
          for (int i = 0; i < intArray.length; i++){
              abcList.add(intArray[i]);
          }
          return abcList;
      }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
}
