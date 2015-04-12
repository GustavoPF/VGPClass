import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

@SuppressWarnings("serial")
public class testFramework extends Applet implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	
	Thread t = new Thread(this);
	
	Terrain terrain;
	
	Dragon dragon = new Dragon();

	
public void init() {
		
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

		requestFocus();
		
		t.start();

	}

	@Override
	public void run() {
		
		terrain = new Terrain(1500);
		
		for(int i = 0; i < 1500; i+=100){
			
			terrain.addLine(new Point(i,450+(int)(100*Lookup.sin[i%360])));
			
			if (dragon.x<1500){
				
				dragon.moveBy(1, 5);
				
			}else{ 
				
				dragon = new Dragon();
				
			}
			
			dragon.handleCollisionWith(terrain);
			
		}

/*
		terrain.addLine(new Point(15, 300));
		terrain.addLine(new Point(25, 330));
		terrain.addLine(new Point(35, 335));
		terrain.addLine(new Point(45, 338));
		terrain.addLine(new Point(55, 340));
		terrain.addLine(new Point(65, 341));
		terrain.addLine(new Point(75, 341));
		terrain.addLine(new Point(85, 340));
		terrain.addLine(new Point(95, 340));
		terrain.addLine(new Point(105, 339));
		terrain.addLine(new Point(115, 338));
		terrain.addLine(new Point(125, 335));
		terrain.addLine(new Point(135, 600));
		terrain.addLine(new Point(145, 700));
		terrain.addLine(new Point(155, 400));
		terrain.addLine(new Point(165, 600));
		terrain.addLine(new Point(175, 500));
		terrain.addLine(new Point(185, 400));
		terrain.addLine(new Point(195, 300));
		terrain.addLine(new Point(205, 600));
		terrain.addLine(new Point(215, 700));
		terrain.addLine(new Point(225, 400));
		terrain.addLine(new Point(235, 600));
		terrain.addLine(new Point(245, 500));
		terrain.addLine(new Point(255, 400));
		terrain.addLine(new Point(265, 300));
		terrain.addLine(new Point(275, 600));
		terrain.addLine(new Point(185, 700));
*/
		
		while (true) {

			repaint();

			try {t.sleep(16);} 
			catch (Exception x) {}
		}
	}

	public void paint(Graphics g) {
		
		terrain.draw(g);
		dragon.draw(g);

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
