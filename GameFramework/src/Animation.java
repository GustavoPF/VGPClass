import java.awt.*;

public class Animation
{
   Image[] image;

   int delay;
   int waittime;


   int current = 1;


   public Animation(String name, int count, int delay)
   {
      image = new Image[count];

      for(int i = 0; i < image.length; i++)

         image[i] = Toolkit.getDefaultToolkit().getImage(name + i + ".gif");


      this.delay = delay;
      waittime = delay;
   }


   public Image getStaticImage()
   {
      return image[0];
   }



   public Image getCurrentImage()
   {
      delay--;

      if(delay == 0)
      {
         delay = waittime;

         current++;
      }

      if(current >= image.length)   current = 1;

      return image[current];
   }

}