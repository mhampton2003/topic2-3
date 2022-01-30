package app;

/**
 * 
 * @author Maya
 *
 */
public class Test {

	/**
	 * Creates person objects and compares them to each other
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		Person person1 = new Person("Maya", "Hampton");
		Person person2 = new Person("Maya", "Hampton");
		Person person3 = new Person(person1);
		
		if (person1 == person2) {
			System.out.println("person1 and person2 are identical using '=='");
		}
		else {
			System.out.println("person1 and person2 are not identical using '=='");
		}
		
		if (person1.equals(person2)) {
			System.out.println("person1 and person2 are identical using 'equals()'");
		}
		else {
			System.out.println("person1 and person2 are not identical using 'equals()'");
		}
		
		if (person1.equals(person3)) {
			System.out.println("person1 and person3 are identical using 'equals()'");
		}
		else {
			System.out.println("person1 and person3 are not identical using 'equals()'");
		}
		
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);

	}

}
