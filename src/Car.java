
public class Car extends Vehicle{
	public Car (int x,int y,int vx,int vy) {
		super(x, y, vx, vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y, 20, 20);
		frame.fillRect(x-10,y+10,40,10);
		frame.fillOval(x-5, y+20, 10, 10);
		frame.fillOval(x+15, y+20, 10, 10);
	}
	
	/*public void move() {
		x+=vx;
		y+=vy;
		7-EX2
		vx*=1.05;
		7-Ex
		if(x>=400) {
			x=0;
		}
	}*/

}
