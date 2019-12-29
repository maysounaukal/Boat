package Boat;

public class speedBoat extends Boat{
public int horsePower;

public speedBoat(String name, int horsePower , double topSpeed, double weight, Captain captain) {
	super(name,topSpeed,weight,captain);
	this.horsePower = horsePower;
}

public speedBoat() {
	// TODO Auto-generated constructor stub
}

public int getHorsePower() {
	return horsePower;
}

public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}

@Override
public void accelerate() {
	System.out.println("de fastBoy gaat in hogere versnelling");
	
}

}
