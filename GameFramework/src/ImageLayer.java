import java.awt.*;

public class ImageLayer
{
   Image image;

   int x;
   int y;
   int z;


   public ImageLayer(String filename, int x, int y, int z)
   {
      image = Toolkit.getDefaultToolkit().getImage(filename);

      this.x = x;
      this.y = y;
      this.z = z;
   }


   public void draw(Graphics g)
   {
      for(int i = 0; i < 10; i++)

         g.drawImage(image, (x + i * 720) - Camera.x / z, y, null);
   }



}