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
	
	public String toString() {
		String p ="Show: " + title + "\n" + numOfCast
				+ " cast members:";
		//System.out.println("Show: " + title + "\n" + numOfCast
		//		+ " cast members:");
		for(int i = 0; i < numOfCast; i++)
		{
			p.concat(cast[i].toString());
		}
		return p;
	}
	
	public void addCastMember(CastMember c) {
		cast[count++] = c;
	}
	
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
