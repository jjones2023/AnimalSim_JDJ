/**
 * This class defines what a BrownBear will be able to do within the simulation.
 * 
 * @author David Jones
 * @version 1.0
 *
 */
public class BrownBear extends Animal implements Walkable, Swimmable {
	
	//Instance Fields
	
	private String subSpecies;
	
	//Constructors
	
	/**
	 * Empty-argument Constructor
	 * Used to set default values for BrownBear
	 */
	public BrownBear() {
		simID = 0;
		//location = [0,0];
		full = false;
		rested = true;
		subSpecies = "Alaskan";
	}
	
	/**
	 * Preferred Constructor
	 * @param simID
	 * @param l
	 * @param subSpecies
	 */
	public BrownBear(int simID, Location l, String subSpecies) {
		setSimID(simID);
		//setLocation(location);
		InvalidSubspeciesException ise = new InvalidSubspeciesException("Invalid Subspecies");
		try { //Checks if the Subspecies that was entered matches the available Subspecies. 
			if(subSpecies.equals("Alaskan"))
				setSubSpecies(subSpecies);
			else if(subSpecies.equals("Asiatic"))
				setSubSpecies(subSpecies);
			else if(subSpecies.equals("European"))
				setSubSpecies(subSpecies);
			else if(subSpecies.equals("Grizzly"))
				setSubSpecies(subSpecies);
			else if(subSpecies.equals("Kodiak"))
				setSubSpecies(subSpecies);
			else if(subSpecies.equals("Siberian"))
				setSubSpecies(subSpecies);
			else {
				throw ise; //Throws InvalidSubspeciesException if the Subspecies entered does not match any of the above subspecies.
			}
		}
		catch(InvalidSubspeciesException ex) {
			System.out.println(ex.getMessage()); //Prints a message to the console concerning the exception
		}
		
		full = false;
		rested = true;
	}
	
	/**
	 * Used to move the BrownBear around the area.
	 * Uses a switch statement to determine direction
	 */
	public void walk(int direction) {
		//1=down, -1=up, 2=right, -2=left
		
		switch(direction) {
		
		case 1:
			yCoord = yCoord-3;
			break;
		case -1:
			yCoord = yCoord+3;
			break;
		case 2: 
			xCoord=xCoord+3;
			break;
		case -2:
			xCoord=xCoord-3;
			break;
		default:
			
		}//end switch
	}//end walk
	/**
	 * Used to move the BrownBear through water.
	 */
	public void swim(int direction) {
		//1=down, -1=up, 2=right, -2=left
		
		switch(direction) {
		
			case 1:
				yCoord = yCoord-2;
				break;
			case -1:
				yCoord = yCoord+2;
				break;
			case 2: 
				xCoord=xCoord+2;
				break;
			case -2:
				xCoord=xCoord-2;
				break;
			default:
				
		} //End switch
	} //end swim
	
	//Getters/Setters/ToString
	
	public String getSubSpecies() {
		return subSpecies;
	}
	public void setSubSpecies(String subSpecies) {
		this.subSpecies = subSpecies;
	}
}
