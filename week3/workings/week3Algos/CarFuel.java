public class CarFuel
{
    // inputs
    // first line, integer dist = distance between cities
    // second line, integer m = miles a car can travel before another refil
    // third line, integer n = number of stops
    // last line, contains stops = stop1, stop2, ...stopn
    
    public int calculateRefills(int dist, int tank, int[] stops){
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
          System.out.println("patrol left at " + stops[i] + " , distance to next stop " + distanceToNextStop);
        }
        return refils;
    }
    public static void main(String[] args){
        System.out.println("Is it working from BlueJ");
    }
}
