package app;

public class Person {
	private String firstName;
	private String lastName;
	
	/**
	 * Person constructor using first and last name
	 * @param firstName The first name
	 * @param lastName The last name
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Person constructor using an already made person object
	 * @param person A created person object
	 */
	public Person(Person person) {
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}
	
	/**
	 * Returns the first name of the person
	 * @return firstName The first name as a string
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Returns the last name of the person
	 * @return lastName The last name as a string
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Overrides the equals() method
	 * Returns the statement that is used and determines whether the 
	 * object's are equal to each other and not the references
	 * @param other An object
	 */
	@Override
	public boolean equals(Object other) {
		if (other == this) {
			System.out.println("I am here in other == this");
			return true;
		}
		if (other == null) {
			System.out.println("I am here in other == null");
			return false;
		}
		if (getClass() != other.getClass()) {
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	/**
	 * Overrides the toString() method
	 * returns the class the person object is in and its first and last name
	 */
	@Override
	public String toString() {
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}

}
