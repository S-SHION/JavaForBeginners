
public class DisplaCarsTrains extends MyFrame{
	public void run() {
		Vehicle[] vehicle=new Vehicle[3];
		vehicle[0] =new Car(10,30,3,0);
	    vehicle[1] =new Car(10,100,5,0);
		vehicle[2] =new Train(10,150,7,0);
		for(int i=0; i<30; i++) {
			clear();
			for (int j=0; j<vehicle.length; j++) {
				vehicle[j].draw(this);
				vehicle[j].move();
			}
			sleep(0.1);
		}

	}
}
