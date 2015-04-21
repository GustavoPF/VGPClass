import java.awt.*;

public class BadCircle extends Circle
{
   public BadCircle(int x, int y, int r)
   {
     super(x, y, r);
   }



   public void turnTowards(Circle c, int degrees)
   {
         if (c.isToLeftOf(this))           rotateLeftBy(degrees);


         if (c.isToRightOf(this))           rotateRightBy(degrees);

   }


   public void chase(Circle c, int speed, int degrees)
   {
         if (c.isToLeftOf(this))      rotateLeftBy(degrees);

         if (c.isToRightOf(this))     rotateRightBy(degrees);

         if (c.isInFrontOf(this))     moveForwardBy(speed);
   }



   public void evade(Circle c, int speed, int degrees)
   {
         if (c.isToLeftOf(this))      rotateRightBy(degrees);

         if (c.isToRightOf(this))     rotateLeftBy(degrees);

         //if (c.isInFrontOf(this))
             moveForwardBy(speed);
   }



}