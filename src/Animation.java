
public class Animation extends MyFrame{
	public void run() {
			/*
			  5-1
			
			int y=150;
			int x=30;
			while (y>=70) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y-=5;
				sleep(0.1);
			}
			while (x<=170) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x+=5;
				sleep(0.1);
			}
		
		5-2
		   
		int y=50;
		int x=30;
		while (y<=200) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,30,30);
			x+=5;
			y+=5;
			sleep(0.1);
		}
		while (x>=30) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,30,30);
			x-=5;
			sleep(0.1);
		}
		while (y>=50) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,30,30);
			x+=5;
			y-=5;
			sleep(0.1);
		}
		while (x>=30) {
			clear();
			setColor(0,128,0);
			fillOval(x,y,30,30);
			x-=5;
			sleep(0.1);
		}
		
		5-3
		
		int y=150;
		int x=30;
		int i;
		for(i=0; i<3; i++) {
			while (x<=170) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x+=5;
				sleep(0.1);
			}
			while (x>=30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x-=5;
				sleep(0.1);
			}
		}
		
		5-EX
		
		int y=150;
		int x=30;
		while (true) {
			while (x<=170) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x+=5;
				sleep(0.1);
			}
			while (y<=250) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y+=5;
				sleep(0.1);
			}
			while (x>=30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x-=5;
				sleep(0.1);
			}
			while (y>=150) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y-=5;
				sleep(0.1);
			}
		}
		
		5-EX2
		
		int y=50;
		int x=30;
		int i;
		while (true) {
			i=0;
			while (x<=170) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x+=5;
				sleep(0.1);
			}
			while (i<=150) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y+=5;
				i+=5;
				sleep(0.1);
			}
			while (x>=30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				x-=5;
				sleep(0.1);
			}
			while (i<=300) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y+=5;
				i+=5;
				sleep(0.1);
			}
		}*/
		
		int y=50;
		int x=30;
		int i=0;
		int j;
		while (true) {
			j=0;
			while (x<=170 && x>=30) {
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				if(i<=140) {
					x+=5;
					i+=5;
				}else {
					x-=5;
					i+=5;
					if(i>=290) {
						i=0;
					}
				}
			
				sleep(0.1);
			}
			if(x>170) {
				x=170;
				y+=5;
			}
			if(x<30) {
				x=30;
				y+=5;
			}
			while (j<=50) {
				
				clear();
				setColor(0,128,0);
				fillOval(x,y,30,30);
				y+=5;
				j+=5;
				sleep(0.1);
			}
		}
	}

}
