package Boat;

public class FisherBoat extends Boat{
public int netSize;
public DeckHand deckHand;


public FisherBoat(String name, int netSize, double topSpeed, double weight, String nickName, DeckHand deckHand) {
	super(name,topSpeed,weight);
	this.netSize = netSize;
	this.deckHand = deckHand;
	}




public FisherBoat() {
	// TODO Auto-generated constructor stub
}




public int getNetSize() {
	return netSize;
}




public void setNetSize(int netSize) {
	this.netSize = netSize;
}




public DeckHand getDeckHand() {
	return deckHand;
}




public void setDeckHand(DeckHand deckHand) {
	this.deckHand = deckHand;
}




@Override
public void accelerate() {
	System.out.println("De vissersboot takelt het net op en gaat zo sneller vooruit");
	
}




public void setNickName(String nickname) {

	
}

}
