/*@author Nathan Chavez (ysn401)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */

//Extends person class
public class CastMember extends Person{

	/*Declare variable numOfRoles(Shows amount of roles for a cast members) as private
	* Declare Object Roles stored as an array of Role objects as private
	*/
	private int numOfRoles, count = 0;
	private Role[] roles; 
	
	//Constructor that takes a String name and numOfRoles
	public CastMember(String name, int age, int numOfRoles) {
		//Calls on Person constructor
		super(name, age);
		this.numOfRoles = numOfRoles;
		roles = new Role[numOfRoles];
	}
	
	
	//Returns a string representation of a CastMember object
	public String toString() {
		
		//Creates stringbulider object
		StringBuilder sb = new StringBuilder();
		
		//Appends name and age to sb for the CastMember object
		sb.append(getName() + " (" + getAge() + ")" + "\n");
		
		//For loop that calls on roles[i] and appends its output to sb
		for(int i = 0; i < numOfRoles; i++)
		{
			 sb.append("\t - " + roles[i] + "\n");
		}
		
		//Returns sb as a string
		return  sb.toString();
	}
	
	//Adds Role object to the Role object array
	public void addRole(Role r) {
		roles[count++] = r;
	}
	
	//Getters and Setters for numOfRoles 
	public int getNumOfRoles() {
		return numOfRoles;
	}
	
	public void setNumOfRoles(int numOfRoles) {
		this.numOfRoles = numOfRoles;
	}
}
