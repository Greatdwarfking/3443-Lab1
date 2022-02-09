/*@author Nathan Chavez (ysn401)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */

public class CastMember extends Person{

	/*Declare variable numOfRoles(Shows amount of roles for a cast members) as private
	* Declare Object Roles stored as an array of Role objects as private
	*/
	private int numOfRoles, count = 0;
	private Role[] roles; 
	
	public CastMember(String name, int age, int numOfRoles) {
		super(name, age);
		this.numOfRoles = numOfRoles;
		roles = new Role[numOfRoles];
	}
	
	
	//Returns a string representation of a person p
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(getName() + " (" + getAge() + ")" + "\n");
		for(int i = 0; i < numOfRoles; i++)
		{
			 sb.append("\t - " + roles[i] + "\n");
		}
		return  sb.toString();
	}
	
	public void addRole(Role r) {
		roles[count++] = r;
	}
	
	public int getNumOfRoles() {
		return numOfRoles;
	}
	
	public void setNumOfRoles(int numOfRoles) {
		this.numOfRoles = numOfRoles;
	}
}
