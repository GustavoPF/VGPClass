import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Framework extends Applet implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	
	Thread t = new Thread(this);
	
	Dragon dragon = new Dragon();

	boolean UP_pressed = false;
	boolean DN_pressed = false;
	boolean LT_pressed = false;
	boolean RT_pressed = false;
	boolean A_pressed = false;
	boolean D_pressed = false;

	public void init() {
		
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);

		requestFocus();
		
		t.start();

	}

	@Override
	public void run() {
		
		while (true) {

			repaint();

			try {
				t.sleep(16);
			} catch (Exception x) {
			}
		}

	}

	public void paint(Graphics g) {
		
		dragon.draw(g);
		terrain.draw(g);

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
