/**
 * This exception is thrown when a user tries to input a subSpecies that is not supported.
 * 
 * @author David Jones
 * @version 1.0
 * SP/2020
 */

public class InvalidSubspeciesException extends RuntimeException {
	public InvalidSubspeciesException(String message) {
		super(message);
	}
}
