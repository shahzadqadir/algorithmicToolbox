import java.util.*;
import java.io.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
      //dist = distance between cities
      //miles = miles a car can travel before refil, equal to full tank
      //stops = where a refil can be made
      int refils = 0;
      int patrolLeft = tank; //initially start with full tank
      int startMiles = 0;
      if (tank > dist){
          return 0;
      }
      //constraints
      if ((dist < 1) || (dist > 100000)){
        return -1;
      }
      if ((tank < 1) || (tank > 400)){
          return -1;
      }
      if ((stops.length < 1) || (stops.length > 300)){
        return -1;
      }
      int distanceToNextStop = 0;
      for (int i = 0; i < stops.length; i++){
          int distanceTravelled = stops[i] - startMiles;
          startMiles = stops[i];
          patrolLeft = patrolLeft - distanceTravelled;
          if (i+1 < stops.length){
              distanceToNextStop = stops[i+1] - stops[i];
          } else {
              distanceToNextStop = dist - stops[i];
          }
          if ((distanceToNextStop <= 0) || (distanceToNextStop > tank)){
              return -1;
          }
          if (distanceToNextStop > patrolLeft){
              refils++;
              patrolLeft = tank;
              //System.out.println("refil done at stop " + stops[i]);
          }
      }
      return refils;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
