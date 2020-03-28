/**
 * The Animal class encapsulates a generic animal that can be sub-classed by other classes. 
 * 
 * @author David Jones
 * @version 1.0
 * SP/2020
 *
 */

public abstract class Animal extends Location {
	
	//Instance Fields
	
	Location location; //Reserves a spot in memory for location
	protected int simID;
	protected boolean full;
	protected boolean rested;
	
	
	//Constructors
	
	/**
	 * Empty-argument constructor
	 */
	public Animal() {
		simID = 0;
		location = new Location(); //Initializes a new Location object with x and y set to 0.
		full = false; 
		rested = true;
	}
	
	/**
	 * Preferred Constructor
	 * @param simID
	 * @param l
	 */
	public Animal(int simID, Location l) {
		InvalidSimIDException isIDe = new InvalidSimIDException("SimID must be an integer greater than or equal to 0");
		try {
			if(simID < 0) {
				throw isIDe;
			}
			else {
				setSimID(simID);
			}
		}
		catch(InvalidSimIDException ex) {
			System.out.println(ex.getMessage());
		}
		setLocation(l);
		full = false;
		rested = true;
	}
	
	//Methods
	
	/**
	 * This 
	 * @return a true/false value depending on what random number is generated
	 */
	public boolean eat() {
		double randomNumber;
		randomNumber = Math.random();
		if(randomNumber <= 0.5) {
			full = false;
		}
		else {
			full = true;
		}
		return full;
	}
	
	/**
	 * A method that determines if an Animal is rested or nit
	 * @return a true/false value depending on a random number between 0 and 1.
	 */
	public boolean sleep() {
		double randomNumber;
		randomNumber = Math.random();
		if(randomNumber <= 0.5) {
			rested = false;
		}
		else {
			rested = true;
		}
		return rested;
	}
	
	//Getters/Setters/ToString
	
	public int getSimID() {
		return simID;
	}
	public void setSimID(int simID) {
		this.simID = simID;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public boolean isFull() {
		return full;
	}
	public void setFull(boolean full) {
		this.full = full;
	}
	public boolean isRested() {
		return rested;
	}
	public void setRested(boolean rested) {
		this.rested = rested;
	}
	
}
