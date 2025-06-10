import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1,10));
		cars.add(new Car(50,100,2,10));
		cars.add(new Car(50,150,3,10));
		cars.add(new Car(50,200,4,10));
		cars.add(new Car(50,250,5,10));
		
		while(true) {
			clear();
			for (int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
		}
	}
}
