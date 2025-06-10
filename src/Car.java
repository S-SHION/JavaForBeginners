import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Car extends Vehicle implements KeyListener{
	public Car (int x,int y,int vx,int vy) {
		super(x, y, vx, vy);
	}
	public void draw(MyFrame frame) {
		frame.fillRect(x, y, 20, 20);
		frame.fillRect(x-10,y+10,40,10);
		frame.fillOval(x-5, y+20, 10, 10);
		frame.fillOval(x+15, y+20, 10, 10);
	}
	
	//キーボードから文字が入力されたときに実行
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("文字が入力されました。");
	}
	//キーが押されたときに実行
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx=-5;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx=5;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			vy=-5;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			vy=5;
		}
	}
	//押されたキーが離されたときに実行
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			vx=0;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			vx=0;
		}
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			vy=0;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			vy=0;
		}
		
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
