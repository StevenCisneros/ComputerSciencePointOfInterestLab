public class Waypoint extends LocalPoint
{
   private double speed;
   private String city;
   
   public Waypoint(double x, double y, double speed, String city)
   {
      super(x, y);
      this.speed = speed;
      this.city = city;
   }
   
   public double toDistance(Travelable t)
   {
      if (t instanceof LocalPoint)
         return distance((LocalPoint) t);
      else
         throw new RuntimeException("Destination is not reachable.");
   }
   
   public double toTime(Travelable t)
   {
      if (t instanceof LocalPoint)
         return distance((LocalPoint) t) / speed;
      else
         throw new RuntimeException("Destination is not reachable.");
   }
   
   public void setSpeed(double speed)
   {
      this.speed = speed;
   }
   
   public double getSpeed()
   {
      return speed;
   }
   
   public void setCity(String city)
   {
      this.city = city;
   }
   
   public String getCity()
   {
      return city;
   }
   
   @Override
   public String toString()
   {
      return String.format("At ( %4.1f , %4.1f ) moving %4.1f MPH in %s", 
         getX(), getY(), speed, city);
   }
   
   @Override
   public boolean equals(Object o)
   {
      if (o instanceof Waypoint)
      {
         Waypoint w = (Waypoint) o;
         return (getX() == w.getX() && getY() == w.getY() && 
            speed == w.speed && city.equals(w.city));
      }
      else
         return false;
   }
}
