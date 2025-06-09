import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1));
		cars.add(new Car(50,100,2));
		cars.add(new Car(50,150,3));
		cars.add(new Car(50,200,4));
		cars.add(new Car(50,250,5));
		
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
