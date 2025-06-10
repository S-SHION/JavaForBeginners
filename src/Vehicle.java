
public class Vehicle {
	int x,y,vx,vy;
	public Vehicle(int x,int y,int vx,int vy) {
		this.x=x;
		this.y=y;
		this.vx=vx;
		this.vy=vy;
	}
	public void draw(MyFrame f) {
		
	}
	public void move(/*MyFrame frame*/) {
		x+=vx;
		y+=vy;
		
		//8-EX
		if(x>=400) {
			x-=500;
		}
		if(x<=-100) {
			x+=500;
		}
		//8-CHALLENGE
		/*if(x>=frame.getWidth()) {
			x-=frame.getWidth()+100;
		}
		if(x<=-100) {
			x+=frame.getWidth()+100;
		}*/
		
	}
	
	
	
}
