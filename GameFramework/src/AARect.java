import java.awt.*;

public class AARect
{
   int x;
   int y;

   int w;
   int h;


   public AARect(int x, int y, int w, int h)
   {
      setBounds(x, y, w, h);
   }


   public void setBounds(int x, int y, int w, int h)
   {
      setLocation(x, y);

      setSize(w, h);
   }

   public void setSize(int w, int h)
   {
      this.w = w;
      this.h = h;
   }

   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }






   public boolean contains(int mx, int my)
   {
      return (mx > x) && (mx < x + w) && (my > y) && (my < y + h);

   }


   public boolean hasCollidedWith(AARect r)
   {
      return  (r.x + r.w >= x)  &&
              (r.x <= x + w)    &&
              (r.y +r.h >= y)   &&
              (r.y <= y + h);
   }



   public void draw(Graphics g)
   {
      g.drawRect(x, y, w, h);

   }


   public void moveBy(int dx, int dy)
   {
      x += dx;

      y += dy;
   }

}