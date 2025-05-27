
public class Practice4 extends MyFrame{
	public void run() {
		int x=10;
		int i;
		for (i=0 ; i<20; i++) {
			if(i<10) {
			    setColor(x,x,x);
			}else {
				setColor(x-40*(i-10),x-40*(i-10),x-40*(i-10));
			}
			fillRect(x,80,10,100);
			x+=20;
			System.out.println(i);
		}
		
	}

}
