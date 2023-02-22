package fr.ldnr.Exception;

// import java.time.format.DateTimeParseException;
import java.util.Date;

/**
 * 
 * @author ThouryB
 *
 */
public class TestException {
	public static void main(String[] args) {

		Date date = null;
		Date today = new Date();

		try {
			System.out.println(date.getClass().getName());
			System.out.println(today.getClass().getName());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("on passe toulours par ici :)");
		}

//		Objet.getClass()
//		Si une instance d'un objet est disponible, le moyen le plus simple de l'obtenir Class est d'invoquer Object.getClass().
//		Bien sûr, cela ne fonctionne que pour les types de référence qui héritent tous de Object.

	}
}
