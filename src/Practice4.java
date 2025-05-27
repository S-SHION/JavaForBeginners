
public class Practice4 extends MyFrame{
	public void run() {
		int x=10;
		int i;
		for (i=0 ; i<20; i++) {
			if(i<10) {
			    setColor(x-10,x-10,x-10);
			}else {
				setColor(x-10-40*(i-10),x-10-40*(i-10),x-10-40*(i-10));
			}
			fillRect(x,80,10,100);
			x+=20;
			System.out.println(i);
		}
		
	}

}
