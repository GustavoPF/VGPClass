import java.awt.*;

public abstract class PolygonModel2D
{

   int x;
   int y;

   int angle;

   int[][] xc = getXCoords();
   int[][] yc = getYCoords();


   public PolygonModel2D(int x, int y, int angle)
   {
      this.x = x;
      this.y = y;

      this.angle = angle;
   }

   public abstract int[][] getXCoords();
   public abstract int[][] getYCoords();


   public void draw(Graphics g)
   {
      int[] xr = new int[4];
      int[] yr = new int[4];


      double cosA = Lookup.cos[angle];

      double sinA = Lookup.sin[angle];


      for(int poly = 0; poly < xc.length; poly++)
      {
         for(int i = 0; i < xr.length; i++)
         {
            xr[i] = (int) (xc[poly][i] * cosA - yc[poly][i] * sinA);

            yr[i] = (int) (xc[poly][i] * sinA + yc[poly][i] * cosA);

         }

         int[] xp = new int[4];
         int[] yp = new int[4];


         for(int i = 0; i < xp.length; i++)
         {
            xp[i] = xr[i] + x;

            yp[i] = yr[i] + y;
         }

         g.drawPolygon(xp, yp, 4);
      }
   }

   public void moveForwardBy(int dist)
   {
      x += (int)(dist * Math.cos(angle * Math.PI / 180));

      y += (int)(dist * Math.sin(angle * Math.PI / 180));

   }

   public void moveBackwardBy(int dist)
   {
      x -= (int)(dist * Math.cos(angle * Math.PI / 180));

      y -= (int)(dist * Math.sin(angle * Math.PI / 180));

   }


   public void moveBy(int dx, int dy)
   {
      x += dx;

      y += dy;
   }


   public void rotateRightBy(int degrees)
   {
      angle += degrees;

      if(angle >= 360) angle -= 360;
   }

   public void rotateLeftBy(int degrees)
   {
      angle -= degrees;

      if(angle < 0)  angle += 360;
   }



}