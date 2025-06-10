import java.util.Vector;

public class Practice8 extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(100,30,10,0));
		vehicles.add(new Car(100,100,-25,0));
		vehicles.add(new Train(100,150,20,0));
		vehicles.add(new Train(100,200,-15,0));
		vehicles.add(new Truck(100,250,15,0));
		vehicles.add(new Truck(100,300,-10,0));
		while(true) {
			clear();
			for (int j=0; j<vehicles.size(); j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move(/*this*/);
			}
			sleep(0.1);
		}
	}
}
