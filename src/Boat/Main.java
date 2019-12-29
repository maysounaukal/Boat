package Boat;

public class Main {

	public static void main(String[] args) {
		SailBoat boat1 = new SailBoat();
		speedBoat boat2= new speedBoat();
		FisherBoat boat3 = new FisherBoat();
		
		boat1.setName("KING OF NAMUR");
		boat1.setSailSize(14.0);
		boat1.setTopSpeed(12.0);
		boat1.setWeight(550.0);
		Captain captain = new Captain();
		captain.name = "Maarten";
		captain.age = 25;
		boat1.setCaptain(captain);
		
		
		
		boat2.setName("fastBoy");
		boat2.setHorsePower(255);
		boat2.setTopSpeed(122);
		boat2.setWeight(2000);
		Captain captain1 = new Captain();
		captain1.name ="Justin";
		captain1.age = 24;
		boat2.setCaptain(captain);
		
		
		boat3.setName("Z54");
		boat3.setNetSize(60);
		boat3.setTopSpeed(40);
		boat3.setWeight(8000);
		boat3.setNickName("John");
		DeckHand deck = new DeckHand();
		deck.name = "Duimpje";
		deck.age = 72;
		
		
		boat1.accelerate();
		boat2.accelerate();
		boat3.accelerate();
		System.out.println("*************************");
		printBoat(boat1);
		printBoat(boat2);
		printBoat(boat3);
		
		

	}
	

	private static void printBoat(FisherBoat boat3) {
	System.out.println(boat3.getName());
	System.out.println(boat3.getNetSize());
	System.out.println(boat3.getWeight());
	System.out.println(boat3.getTopSpeed());
	boat3.accelerate();
	System.out.println("****************************");
		
	}

	private static void printBoat(speedBoat boat2) {
		System.out.println(boat2.getName());
		System.out.println(boat2.getTopSpeed());
		System.out.println(boat2.getHorsePower());
		System.out.println(boat2.getWeight());
		System.out.println(boat2.horsePower);
		
		boat2.accelerate();
		System.out.println("*************************");
		
	}

	private static void printBoat(SailBoat boat1) {
		System.out.println(boat1.getName());
		System.out.println(boat1.getSailSize());
		System.out.println(boat1.getWeight());
		System.out.println(boat1.getTopSpeed());
		boat1.accelerate();
	System.out.println("***********************");}
		
	

}
