package Boat;

public class SailBoat extends Boat{
public double sailSize;


public SailBoat(String name, double sailSize, double topSpeed, double weight, Captain captain) {
	super(name,topSpeed,weight,captain);
	this.sailSize = sailSize;
	
}


public SailBoat() {
	// TODO Auto-generated constructor stub
}


public double getSailSize() {
	return sailSize;
}


public void setSailSize(double sailSize) {
	this.sailSize = sailSize;
}


@Override
public void accelerate() {
	System.out.println("De wind blaast de zeilen bol en versnelt het schip");
	
}

}
