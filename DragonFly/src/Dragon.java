
public class Dragon extends DirectedCircle {

	public Dragon() {
		super(100, 100, 15);
		// TODO Auto-generated constructor stub
	}
	
	public boolean hasCollidedWith(Line line){
		
		return line.distanceTo(x, y) < r && this.x>line.x1 && this.x<line.x2;

	}

}
