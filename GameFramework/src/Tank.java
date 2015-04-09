import java.awt.*;

public class Tank extends PolygonModel2D
{
   int gunangle = 0;


   public int[][] getXCoords()
   {
      int[][] xc =
      {
         {50, 50, -50, -50},
         {40, 40, -40, -40},
         {40, 40, -40, -40},
         {40, 40, 15, 15}
      };
      return xc;
   }


   public int[][] getYCoords()
   {
      int[][] yc =
      {
         {-25,  25,  25, -25},
         { 25,  35,  35,  25},
         {-25, -35, -35, -25},
         { -5,   5,   5,  -5}
      };
      return yc;
   }

   public Tank(int x, int y, int angle)
   {
      super(x, y, angle);
   }


   public void draw(Graphics g)
   {
      super.draw(g);

      g.drawOval(x-15, y-15, 30, 30);

   }


}




/*



   public void draw(Graphics g)
   {
      int[] xr = new int[4];
      int[] yr = new int[4];


      double cosA = Lookup.cos[angle];

      double sinA = Lookup.sin[angle];


      for(int poly = 0; poly < xc.length; poly++)
      {
         if(poly == 3)
         {
            int ang = angle + gunangle;

            if (ang > 359)  ang -= 360;
            if (ang < 0)    ang += 360;

            cosA = Lookup.cos[ang];
            sinA = Lookup.sin[ang];
         }


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


      g.drawOval(x -15, y - 15, 30, 30);

   }
*/