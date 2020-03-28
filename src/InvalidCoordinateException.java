/**
 * This exception is thrown when a user sets either x or y as less than 0.
 * 
 * @author David Jones
 * @version 1.0
 * SP/2020
 */

public class InvalidCoordinateException extends RuntimeException{
	public InvalidCoordinateException(String message) {
		super(message);
	}
}
