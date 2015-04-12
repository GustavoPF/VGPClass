import java.awt.Graphics;
import java.awt.Point;


public class Level {
	
	Terrain terrain;
	int gravity = 0;
	
	Dragon dragon = new Dragon();
	
	boolean isActive = true;
	
	public Level(String levelName){
		
		if (levelName == "1"){
			
			terrain = new Terrain(700);
			
			gravity = 5;

			terrain.addLine(new Point(150, 400));
			terrain.addLine(new Point(250, 600));
			terrain.addLine(new Point(350, 500));
			terrain.addLine(new Point(450, 400));
			terrain.addLine(new Point(550, 300));
			terrain.addLine(new Point(650, 600));
			terrain.addLine(new Point(750, 700));
		}
		
		if (levelName == "2"){
			
			terrain = new Terrain(300);

			terrain.addLine(new Point(15, 400));
			terrain.addLine(new Point(25, 600));
			terrain.addLine(new Point(35, 500));
			terrain.addLine(new Point(45, 400));
			terrain.addLine(new Point(55, 300));
			terrain.addLine(new Point(65, 600));
			terrain.addLine(new Point(75, 700));
			terrain.addLine(new Point(85, 400));
			terrain.addLine(new Point(95, 600));
			terrain.addLine(new Point(105, 500));
			terrain.addLine(new Point(115, 400));
			terrain.addLine(new Point(125, 300));
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
		}
		
		if (levelName == "3"){

			terrain.addLine(new Point(150, 400));
			terrain.addLine(new Point(250, 600));
			terrain.addLine(new Point(350, 500));
			terrain.addLine(new Point(450, 400));
			terrain.addLine(new Point(550, 300));
			terrain.addLine(new Point(650, 600));
			terrain.addLine(new Point(750, 700));
		}
		
		if (levelName == "4"){

			terrain.addLine(new Point(150, 400));
			terrain.addLine(new Point(250, 600));
			terrain.addLine(new Point(350, 500));
			terrain.addLine(new Point(450, 400));
			terrain.addLine(new Point(550, 300));
			terrain.addLine(new Point(650, 600));
			terrain.addLine(new Point(750, 700));
		}
		
		if (levelName == "5"){

			terrain.addLine(new Point(150, 400));
			terrain.addLine(new Point(250, 600));
			terrain.addLine(new Point(350, 500));
			terrain.addLine(new Point(450, 400));
			terrain.addLine(new Point(550, 300));
			terrain.addLine(new Point(650, 600));
			terrain.addLine(new Point(750, 700));
		}
		
		while(isActive){
			dragon.moveForwardBy(gravity);
			dragon.handleCollisionWith(terrain);
		}
	
	}
	
	public void draw(Graphics g){
		
		terrain.draw(g);
		dragon.draw(g);
	}
	
	//worm velocity
	//terrain
	//end of level
}
