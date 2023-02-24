package Flux;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {
	public static void main(String[] args) {

		// Généré un Fichier

		File fileMenu = new File("C:\\Users\\ThouryB\\Desktop\\Formation FJSA\\Java Avancé\\Menu.txt");

		if (!fileMenu.exists()) {
			try {
				fileMenu.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				FileWriter writer = new FileWriter(fileMenu);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write("*** Ici Bientot résumé de la commande ***");
				bw.newLine();
				bw.write("Test ");
				bw.write("   test  ");
				bw.newLine();
				bw.write(" ----   test  ");
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
