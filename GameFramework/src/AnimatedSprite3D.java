import java.awt.*;

public class AnimatedSprite3D extends AnimatedSprite
{
   int z;

   int w;
   int h;

   final static int d = 400;
   final static int originX = 512;
   final static int originY = 350;




   public AnimatedSprite3D(int x, int y, int z, int w, int h, String name, String[] pose)
   {
      super(x, y, name, pose);

      this.z = z;

      this.w = w;
      this.h = h;
   }


   public void moveForwardBy(int dz)
   {
      z += dz;

      dir = UP;

      moving = true;
   }

   public void moveBackwardBy(int dz)
   {
      z -= dz;

      dir = DN;

      moving = true;
   }

   public void moveLeftBy(int dx)
   {
      x -= dx;

      dir = LT;

      moving = true;
   }

   public void moveRightBy(int dx)
   {
      x += dx;

      dir = RT;

      moving = true;
   }



   public void draw(Graphics g)
   {
      if(moving)  g.drawImage
                  (
                      animation[dir].getCurrentImage(),
                      originX + d*x/z - d*w/(2*z) ,
                      originY - d*y/z-d*h/z,
                      d*w/z,
                      d*h/z,
                      null
                  );

      else        g.drawImage
                  (
                      animation[dir].getStaticImage(),
                      originX + d*x/z - d*w/(2*z) ,
                      originY - d*y/z-d*h/z,
                      d*w/z,
                      d*h/z,
                      null
                  );


      moving = false;
   }
}