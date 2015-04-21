import java.awt.*;


public class Cube
{
   int x;
   int y;
   int z;

   int angle = 180;


   int[][][] structure =
   {
      {
         {-1, 1, -1},  {1, 1, -1}, {1,-1,-1}, {-1,-1,-1}
      },
      {
         {-1, 1, 1},  {1, 1, 1}, {1,-1,1}, {-1,-1,1}
      },
      {
         {1, 1, -1},  {1, 1, 1}, {1,-1,1}, {1,-1,-1}
      },
      {
         {-1, 1, -1},  {-1, 1, 1}, {-1,-1,1}, {-1,-1,-1}
      },
      {
         {-1, 1, -1},  {-1, 1, 1}, {1,1,1}, {1,1,-1}
      },
      {
         {-1, -1, -1},  {-1, -1, 1}, {1,-1,1}, {1,-1,-1}
      },
   };


   public Cube(int x, int y, int z)
   {
      this.x = x;
      this.y = y;
      this.z = z;
   }


   public void rotateLeftBy(int degrees)
   {
      angle -= degrees;
   }

   public void rotateRightBy(int degrees)
   {
      angle += degrees;
   }


   public void moveLeftBy(int dx)
   {
      x -= dx;
   }

   public void moveRightBy(int dx)
   {
      x += dx;
   }



   public void moveUpBy(int dy)
   {
      y -= dy;
   }

   public void moveDownBy(int dy)
   {
      y += dy;
   }

   public void moveForwardBy(int dz)
   {
      z -= dz;
   }

   public void moveBackwardBy(int dz)
   {
      z += dz;
   }


   public void draw(Graphics g)
   {
      int d = 400;
      int x_origin = 512;
      int y_origin = 389;

      double  cosA = Lookup.cos[angle];
      double  sinA = Lookup.sin[angle];

      double  cosC = Lookup.cos[Camera.angle];
      double  sinC = Lookup.sin[Camera.angle];


      for(int poly = 0; poly < structure.length; poly++)
      {
         //
         int[] xs = new int[structure[poly].length];
         int[] ys = new int[structure[poly].length];

         for(int vertex = 0; vertex < structure[poly].length; vertex++)
         {
            // Collect coordinates for one vertex in the current polygon (Model Space)
            int xm = 50*structure[poly][vertex][0];
            int ym = 50*structure[poly][vertex][1];
            int zm = 50*structure[poly][vertex][2];

            // Rotate Model Around x-axis
            int xr = xm;
            int yr = (int)(-zm * sinA + ym * cosA);
            int zr = (int)(-zm * cosA - ym * sinA);


/*            // Rotate Model Around z-axis
            int xr = (int)(xm * cosA - ym * sinA);
            int yr = (int)(xm * sinA + ym * cosA);
            int zr = zm;
*/
            // Translate Model to World
            int xw = xr + x;
            int yw = yr + y;
            int zw = zr + z;


            // Translate World to View  (Camera is moved to the origin)
            int xv = xw - Camera.x;
            int yv = yw - Camera.y;
            int zv = zw - Camera.z;


            // Rotate Camera around y-axis
            int xc = (int)(xv * cosC + zv * sinC);
            int yc = zv;
            int zc = (int)(xv * sinC - zv * cosC);




            // 3D Perspective Transformation then Adjustment of Screen Origin
            xs[vertex] = d * xc / zc + x_origin;
            ys[vertex] = d * yc / zc + y_origin;

         }

         g.drawPolygon(xs, ys, structure[poly].length);
      }
   }
}








