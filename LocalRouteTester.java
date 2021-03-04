import java.util.ArrayList;

public class LocalRouteTester
{
   static ArrayList<Travelable> list = new ArrayList<>();
   static double routeDistance = 0.0;
   static double routeTime = 0.0;
   
   public static void main(String[] args)
   {
      list.add(new Waypoint(0, 0, 40, "Anaheim"));
      list.add(new Waypoint(3, 4, 40, "Brea"));
      list.add(new Waypoint(6, 8,  0, "Cerritos"));
      
      Waypoint wStart = (Waypoint) list.get(0);  // We know these are Waypoints.
      System.out.println(wStart);
      list.remove(0);
      
      for (Travelable t : list)
      {
         Waypoint wStop = (Waypoint) t;          // We know these are Waypoints.
         System.out.println(wStop);
         routeDistance += wStart.toDistance(wStop);
         routeTime += wStart.toTime(wStop);
         wStart = wStop;
      }
            
      System.out.printf("Total distance = %.1f MPH%n", routeDistance);
      System.out.printf("Total time = %d hours %02d minutes%n", 
         (int) routeTime, (int) ((routeTime - (int) routeTime) * 60));
   }
}
