/*@author Nathan Chavez (ysn401)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */

public class Show {

	private CastMember[] cast;
	private String title;
	
	public Show(String title, int numOfCast) {
		
		cast = new CastMember[numOfCast];
		this.title = title;
	}
	
	public String toString() {
		
		cast.toString();
		
		 return "0";
	}
	
	public void addCastMember(CastMember c) {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
}