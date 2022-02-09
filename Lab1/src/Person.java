/*@author Nathan Chavez (ysn401)
 * UTSA CS 3443 - Lab 1
 * Fall 2021
 */

public abstract class Person {

	//Declare variables name and age as private
	protected String name;
	protected int age;
	
	//Constructor initializes variables name and age
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	//Returns a string representation of a person p
	public String toString() {
		return getName() + " (" + getAge() + ") ";
	}
	
	// Create getters and setters for name and age
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
