package fr.ldnr.entities;

/**
 * 
 * @author ThouryB
 *
 */
public class City {

	// attributs
	private String name;
	private String country;
	private Integer numberOfInhabitants;
	static int counter = 0;

	// constructeurs
	public City(String name, String country, int numberOfInhabitants) {
		setName(name);
		setCountry(country);
		setNumberOfInhabitants(numberOfInhabitants);
		this.counter++;
	}

	public City(String name, int numberOfInhabitants) {
		setName(name);
		setCountry("unknown");
		setNumberOfInhabitants(numberOfInhabitants);
		this.counter++;
	}

	public City(String name, String country) {
		setName(name);
		setCountry(country);
		setNumberOfInhabitants(0);
		this.counter++;
	}

	public City(String name) {
		setName(name);
		this.country = "unknown";
		this.numberOfInhabitants = 0;
		this.counter++;
	}

	public City() {
		this.name = "unknown";
		this.country = "unknown";
		this.numberOfInhabitants = 0;
		this.counter++;
	}

	// méthodes
	@Override
	public String toString() {
		return "Ville : " + getName() + ", Pays : " + getCountry() + ", habitants : " + getNumberOfInhabitants();
	}

	// Accesseurs
	public String getName() {
		return name;
	}

	public void setName(String name){
		
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumberOfInhabitants() {
		return numberOfInhabitants;
	}

	public void setNumberOfInhabitants(int numberOfInhabitants) {
		if (numberOfInhabitants < 0) {
			System.out.println("Le nombre d'habitants ne peut pas êtres négatif!");
			throw new RuntimeException("Le nombre d'habitants ne peut pas êtres négatif!");
		}
		this.numberOfInhabitants = numberOfInhabitants;
	}

	public static int getConteur() {
		return counter;
	}

	public static void setConteur(int conteur) {
		City.counter = conteur;
	}
}

// git remote add origin https://github.com/BenoitDu47/ExercicePoo.git
// git branch -M main