package fr.ldnr.entities;
/**
 * 
 * @author ThouryB
 *
 */
public class Person extends City{

	// attributs
	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private City bornCity;

	// constructeurs
	public Person(String lastName, String firstName, int age, String address, City birthTown) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.bornCity = birthTown;
	}

	public Person(String lastName, String firstName, int age) {
		setlastName(lastName);
		setFirstName(firstName);
		setAge(age);
		this.address = "unknown";
	}

	public Person(String lastName, String firstName) {
		setlastName(lastName);
		setFirstName(firstName);
		setAge(0);
		this.address = "unknown";
	}

	// méthodes
	@Override
	public String toString() {
		return getlastName() + ", " + getFirstName() + ", " + getAge()
				+ "ans, Habitant " + getAddress() + ", Ville de naissance " + this.bornCity;
	}

	// Accesseurs
	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
