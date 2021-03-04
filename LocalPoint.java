import javafx.geometry.Point2D;

public abstract class LocalPoint extends Point2D implements Travelable
{
   public LocalPoint(double x, double y)
   {
      super(x, y);
   }
}
