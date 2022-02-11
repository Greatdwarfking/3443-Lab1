/*@author Nathan Chavez (ysn401)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */

public class Show {

	private CastMember[] cast;
	private String title;
	private int count = 0, numOfCast;
	
	//Constructor that takes a String and and Integer
	public Show(String title, int numOfCast) {
		
		//Creates new Castmember array of numOfCast
		cast = new CastMember[numOfCast];
		this.title = title;
		this.numOfCast = numOfCast;  
	}
	
	//Print a String representation of a Show object
	public String toString() {
		
		//Creates stringbulider object
		StringBuilder sb = new StringBuilder();
		
		//Appends sb to include title and number of cast members
		sb.append("Show: " + title + "\n" + numOfCast
				+ " cast members:\n");
		
		//For loop that calls on cast[i].toString() and appends its output to sb
		for(int i = 0; i < numOfCast; i++)
		{
			sb.append(cast[i].toString());
		}
		
		//Returns sb as a string
		return sb.toString();
	}
	
	//Adds cast member to the CastMember object array
	public void addCastMember(CastMember c) {
		cast[count++] = c;
	}
	
	//Getters and Setters for title and numOfCast variables
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNumOfCast() {
		return numOfCast;
	}
	
	public void setNumOfCast(int numOfCast) {
		this.numOfCast = numOfCast;
	}
}
