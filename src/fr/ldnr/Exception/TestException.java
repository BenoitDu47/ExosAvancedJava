package fr.ldnr.Exception;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println(today.getClass().getName());
		}

//		Objet.getClass()
//		Si une instance d'un objet est disponible, le moyen le plus simple de l'obtenir Class est d'invoquer Object.getClass().
//		Bien sûr, cela ne fonctionne que pour les types de référence qui héritent tous de Object.

//		String filePath = "C:\\Users\\ThouryB\\Documents\\toto.txt";
//		try {
//			InputStream inputStream = new FileInputStream(filePath);
//			String result = readFromInputStream(inputStream);
//			System.out.println(result);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	private static String readFromInputStream(InputStream inputStream) throws IOException {
//		StringBuilder resultStringBuilder = new StringBuilder();
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				resultStringBuilder.append(line).append("\n");
//			}
//		}
//		return resultStringBuilder.toString();
	}
}
