
public class Dragon extends DirectedCircle {

	public Dragon() {
		super(100, 100, 15);
		// TODO Auto-generated constructor stub
	}
	
	public boolean hasCollidedWith(Line line){
				
		return line.distanceTo(x, y) < r && this.x>line.x1 && this.x<line.x2 && this.y> line.y2;

	}
	
	private boolean hasCollidedWith(Terrain terrain) {
		
		for (int i = 0; terrain.surface[i].x1 < this.x && terrain.surface[i].x2 > this.x; i++ ){
			
			return hasCollidedWith(terrain.surface[i]);
			
		}
		
		return false;
	}
	
	private Line hasCollidedWith(Terrain terrain, String l) {
		
		for (int i = terrain.end; i > 0; i-- ){
			
			System.out.println("I am here " + this.x + "' "+ this.y);
			
			if (hasCollidedWith(terrain.surface[i])) return terrain.surface[i];
			
		}
		
		return null;
	}
	
/*	public void handleCollisionWith(Terrain terrain)
	{
		if (hasCollidedWith(terrain))
		{
			//for(int i = 0, terrain.)
			double d = line.distanceTo(x, y);

			double dist = r - d +5;

			moveBy((int)(dist * line.xN), (int)(dist * line.yN));
		}
	}*/
	
	public void handleCollisionWith(Terrain terrain)
	{
		if (hasCollidedWith(terrain)){
			
			Line l = hasCollidedWith(terrain,"l");
			
			if (l != null){

				double d = l.distanceTo(x, y);

				double dist = r - d +5;

				moveBy((int)(dist * l.xN), (int)(dist * l.yN));

			}
			
		}
	}

	

}
