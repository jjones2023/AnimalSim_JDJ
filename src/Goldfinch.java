/**
 * This class holds all the Instance Fields/Methods needed for GoldFinch
 * 
 * @author David Jones
 * @version 1.0
 *
 */
public class Goldfinch extends Animal implements Walkable, Flyable{
	
	//Instance Fields
	
	private double wingSpan;
	
	//Constructors
	
	public Goldfinch() {
		simID = 0;
		location = new Location(); //Initializes a new Location object with x and y set to 0
		full = false;
		rested = true;
		wingSpan = 9.0;
	}
	
	public Goldfinch(int simID, Location l, double wingSpan) {
		setSimID(simID);
		setLocation(location);
		InvalidWingspanException iwe = new InvalidWingspanException("Wingspan must be between 5cm and 11cm");
		try {
			if(wingSpan < 5 || wingSpan > 11) {
				throw iwe;
			}
			else {
				setWingSpan(wingSpan);
			}
		}
		catch(InvalidWingspanException ex) {
			System.out.println(ex.getMessage());
		}
		full = false;
		rested = true;
	}
	
	//Methods
	
	public void walk(int direction) {
		//1=down, -1=up, 2=right, -2=left
		
		switch(direction) {
		
		case 1:
			yCoord = yCoord-1;
			break;
		case -1:
			yCoord = yCoord+1;
			break;
		case 2: 
			xCoord=xCoord+1;
			break;
		case -2:
			xCoord=xCoord-1;
			break;
		default:
			
		}//end switch
	}//end walk
	public void fly(Location l) {
		location = new Location(xCoord, yCoord);
	}

	
	//Getters/Setters/ToString
	
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
}
