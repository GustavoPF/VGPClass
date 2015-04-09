import java.awt.*;

public class AnimatedSprite extends AARect
{
   int dir = 2;


   Animation[] animation;

   boolean moving = false;


   public AnimatedSprite(int x, int y, String name, String[] pose)
   {
     super(x, y, 20, 50);

     animation = new Animation[pose.length];

     for(int i = 0; i < pose.length; i++)

        animation[i] = new Animation(name + "_" + pose[i] + "_", 5, 10);
   }


   public void draw(Graphics g)
   {
      //super.draw(g);

      if(moving)  g.drawImage(animation[dir].getCurrentImage(), x, y, null);

      else        g.drawImage(animation[dir].getStaticImage(), x, y, null);

      moving = false;
   }


   public void moveBy(int dx, int dy)
   {
      x += dx;

      y += dy;

      moving = true;
   }

   public void moveUpBy(int dist)
   {
      y -= dist;

      dir = 0;

      moving = true;
   }

   public void moveDownBy(int dist)
   {
      y += dist;

      dir = 1;

      moving = true;
   }

   public void moveLeftBy(int dist)
   {
      x -= dist;

      dir = 2;

      moving = true;
   }

   public void moveRightBy(int dist)
   {
      x += dist;

      dir = 3;

      moving = true;
   }




     





}