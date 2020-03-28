/**
 * This class encapsulates a point on a simulation map.
 * 
 * @author David Jones
 * @version 1.0
 * Programming Project 3
 * SP/2020
 * 
 */


public class Location {
	
	//Instance Fields
	
	protected int xCoord;
	protected int yCoord;
	
	//Constructors
	
	/**
	 * Empty-argument Constructor
	 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}
	
	/**
	 * Preferred Constructor
	 * @param x X coordinate
	 * @param y Y coordinate
	 */
	public Location(int x, int y) {
		setxCoord(x);
		setyCoord(y);
	}
	
	//Methods
	
	/**
	 * Used to update the location of the animal
	 * @param x
	 * @param y
	 */
	public void update(int x, int y) {
		InvalidCoordinateException ice = new InvalidCoordinateException("X and Y must be greater than 0.");
		try {
			if(x < 0 || y < 0) {
				throw ice;
			}
			else {
				setxCoord(x);
				setyCoord(y);
			}
		}
		catch(InvalidCoordinateException ex) {
			System.out.println(ex.getMessage());
		}
	}
	/**
	 * Used to get the current coordinates
	 * @return the current location
	 */
	public int[] getCoordinates() {
		int[] location ={xCoord, yCoord};  //initializing array
		return location;  
	}
	
	//Getters/Setters/ToString
	
	public int getxCoord() {
		return xCoord;
	}
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}
	public int getyCoord() {
		return yCoord;
	}
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
}
