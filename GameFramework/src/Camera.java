public class Camera
{

   static int x = 0;
   static int y = 0;
   static int z = 0;

   static int angle = 0;

   public static void rotateLeftBy(int degrees)
   {
      angle += degrees;
   }

   public static void rotateRightBy(int degrees)
   {
      angle -= degrees;
   }


   public static void moveLeftBy(int dx)
   {
      x -= dx;
   }

   public static void moveRightBy(int dx)
   {
      x += dx;
   }

   public static void moveUpBy(int dy)
   {
      y += dy;
   }

   public static void moveDownBy(int dy)
   {
      y -= dy;
   }

   public static void moveInBy(int dz)
   {
      z -= dz;
   }

   public static void moveOutBy(int dz)
   {
      z += dz;
   }

}
