/* Author: Joseph Nicholls
 * Class ID: 85141?
 * Description: This is a class called AddingMachine. It stores a value called "total"
 * which can be modified using internal methods. A history of those operations is also
 * stored and can be called at any time.
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Default constructor for AddingMachine
	 * Sets initial value of "total" to 0 and "history" to "0"
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Method that returns the total stored in the AddingMachine object
	 * 
	 * @return the total stored in the AddingMachine object
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Method that takes the value passed in and adds it to the total stored in the object
	 * It also appends the operation to the end of the history string
	 * 
	 * @param value
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Method that takes the value passed in and subtracts it from the total stored in the object
	 * It also appends the operation to the end of the history string
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Method that returns a history of what was done to the object
	 * ex: "0 + 4 - 2 + 5"
	 * 
	 * @return a string containing a history of what was done to the object
	 */
	public String toString () {
		return "";
	}

	/**
	 * Method that resets the total to zero and clears the history
	 */
	public void clear() {
	
	}
}
