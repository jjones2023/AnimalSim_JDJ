/**
 * The Application class is used to test all aspects of the program
 * 
 * @author David Jones
 * @version 1.0
 * SP/2020
 */
public class Application {
	/**
	 * The main method is used to run all tests for the program
	 * @param args
	 */
	public static void main(String[] args) {		
	//Location Tests
		//update(10, 20);
	//Animal Tests
	/*
	 * Animal a = new Animal();
	 * Cannot instantiate Animal due to it being abstract.
	 */
	//Goldfinch Tests
	Animal g = new Goldfinch();
		g.eat();
		g.sleep();
		g.setSimID(10);
		//Cannot test walk or fly for unknown reasons.
		
		
	//BrownBear Tests
	Animal b = new BrownBear();
		b.eat();
		b.sleep();
		b.setSimID(10);
		//Cannot test walk or swim for unknown reasons.
	}
}
