import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class      GameFramework

       extends    Applet

       implements Runnable,
                  KeyListener,
                  MouseListener,
                  MouseMotionListener
{
   Thread t = new Thread(this);


   boolean UP_pressed = false;
   boolean DN_pressed = false;
   boolean LT_pressed = false;
   boolean RT_pressed = false;
   boolean A_pressed  = false;
   boolean D_pressed  = false;




  BattleLord bl = new BattleLord(100, 100);

  GreenGuy[]  gg = new GreenGuy[10];

  //GreenGuy selectedGG;

  boolean[] selectedGG = new boolean[10];


  AARect selector = new AARect(0, 0, -1, -1);



   AARect r1 = new AARect(10, 10, 100, 200);


   Tank tank = new Tank(500, 350, 0);

   Line line = new Line(100, 100, 900, 600);

   Circle c = new Circle(500, 200, 30);


   BadCircle b = new BadCircle(500, 300, 30);


   public void init()
   {
      addKeyListener(this);
      addMouseListener(this);
      addMouseMotionListener(this);

      requestFocus();



      for(int i = 0; i < gg.length; i++)
      {
         gg[i] = new GreenGuy(25*i +50, 100);

      }


      t.start();


   }




   public void run()
   {
      while(true)
      {
        /*
         if (UP_pressed)   c.moveForwardBy(10);
         if (DN_pressed)   c.moveBackwardBy(5);
         if (LT_pressed)   c.rotateLeftBy(3);
         if (RT_pressed)   c.rotateRightBy(3);



         if (UP_pressed)   bl.moveUpBy(5);
         if (DN_pressed)   bl.moveDownBy(5);
         if (LT_pressed)   bl.moveLeftBy(5);
         if (RT_pressed)   bl.moveRightBy(5);

*/

         for(int i = 0; i < gg.length; i++)
         {
            if(selectedGG[i])
            {
               if (UP_pressed)   gg[i].moveUpBy(3);
               if (DN_pressed)   gg[i].moveDownBy(3);
               if (LT_pressed)   gg[i].moveLeftBy(5);
               if (RT_pressed)   gg[i].moveRightBy(5);
            }
         }


/*         if (UP_pressed)   selectedGG.moveUpBy(3);
         if (DN_pressed)   selectedGG.moveDownBy(3);
         if (LT_pressed)   selectedGG.moveLeftBy(5);
         if (RT_pressed)   selectedGG.moveRightBy(5);

*/
         b.evade(c, 4, 3);

         c.handleCollisionWith(line);
         b.handleCollisionWith(line);

         repaint();

         try
         {
            t.sleep(16);
         }
         catch(Exception x){};
      }

   }


   public void paint(Graphics g)
   {
       //r1.draw(g);

       //tank.draw(g);


       //bl.draw(g);

       for(int i = 0; i < gg.length; i++)

         gg[i].draw(g);


        selector.draw(g);

       //line.draw(g);

       //c.draw(g);
       //b.draw(g);
   }


   public void keyPressed(KeyEvent e)
   {
      int code = e.getKeyCode();


      if (code == e.VK_UP)     UP_pressed = true;
      if (code == e.VK_DOWN)   DN_pressed = true;
      if (code == e.VK_LEFT)   LT_pressed = true;
      if (code == e.VK_RIGHT)  RT_pressed = true;
      if (code == e.VK_A)      A_pressed = true;
      if (code == e.VK_D)      D_pressed = true;

   }

   public void keyReleased(KeyEvent e)
   {

      int code = e.getKeyCode();


      if (code == e.VK_UP)     UP_pressed = false;
      if (code == e.VK_DOWN)   DN_pressed = false;
      if (code == e.VK_LEFT)   LT_pressed = false;
      if (code == e.VK_RIGHT)  RT_pressed = false;
      if (code == e.VK_A)      A_pressed = false;
      if (code == e.VK_D)      D_pressed = false;

   }

   public void keyTyped(KeyEvent e) {  }






   public void mouseMoved(MouseEvent e)
   {
   }


   public void mouseDragged(MouseEvent e)
   {
      int mx = e.getX();
      int my = e.getY();

      int px = selector.x;
      int py = selector.y;

      selector.setSize(mx-px, my - py);

   }

   public void mousePressed(MouseEvent e)
   {
      int mx = e.getX();
      int my = e.getY();

      selector.setLocation(mx, my);
   }

   public void mouseReleased(MouseEvent e)
   {
      for(int i = 0; i < gg.length; i++)

         if (gg[i].hasCollidedWith(selector)) selectedGG[i] = true;
         else                                 selectedGG[i] = false;


      selector.setBounds(0, 0, -1, -1);
   }

   public void mouseClicked(MouseEvent e)
   {
   /*

      int mx = e.getX();
      int my = e.getY();

      for(int i = 0; i < gg.length; i++)

         if (gg[i].contains(mx, my))  selectedGG = gg[i];
    */
   }

   public void mouseEntered(MouseEvent e)
   {
   }

   public void mouseExited(MouseEvent e)
   {
   }



}