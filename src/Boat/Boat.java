package Boat;

public abstract class Boat {
private double weight;
private double topSpeed;
private String name;
private Captain captain;

public Boat(String name, double topSpeed, double weight, Captain captain) {
	this.name = name;
	this.topSpeed = topSpeed;
	this.weight = weight;
	this.captain = captain;
}

public Boat(String name, double topSpeed, double weight) {
this.name = name;
this.topSpeed = topSpeed;
this.weight = weight;

}
public Boat() {};
public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

public double getTopSpeed() {
	return topSpeed;
}

public void setTopSpeed(double topSpeed) {
	this.topSpeed = topSpeed;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Captain getCaptain() {
	return captain;
}

public void setCaptain(Captain captain) {
	this.captain = captain;
}

public abstract void accelerate();
}
