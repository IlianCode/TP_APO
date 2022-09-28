package image;

import java.io.FileOutputStream;
import java.io.IOException;


public class TestImage {
	public static void main(String[] args) {

		// Exercice 1 -Test initial de création d'une image
		Image img = new Image();
		img.save("images/exemple.png");
		
		

        // TODO: décommenter le code suivant au fur et à mesure des exercices.
		
		// Exercice 2 -Tests de getMin et getMax
		Image irm = Image.open("images/image_irm.png");
		System.out.println("Image IRM: min: " + (int) irm.getMin() + ", max: " + (int) irm.getMax());

		Image scanner = Image.open("images/image_scanner.png");
		System.out.println("Image Scanner: min: " + (int) scanner.getMin() + ", max: " + (int) scanner.getMax());

		// Exercice 3 - Test de l'histogramme
	    prettyPrintHisto(img.getHistogramme(), "exemple");
	    prettyPrintHisto(irm.getHistogramme(), "irm");
	    prettyPrintHisto(scanner.getHistogramme(), "scanner");

	    // Histogramme de l'image mystere
	    Image mystere = Image.open("images/mystere.png");
	    prettyPrintHisto(mystere.getHistogramme(), "mystere");




	    // Exercice 4 - Étirement de contraste
	    // Todo, tester l'étirement contraste sur les images indiquées
	    mystere.etireContraste();
		
	    mystere.save("images/myster-etire.png");
	    Image pollen = Image.open("images/pollen.png");
	    pollen.etireContraste();
	    pollen.save("images/pollen-etire.png");

	    Image amelie = Image.open("images/amelie.png");
	    amelie.etireContraste();
	    amelie.save("images/amelie-etire.png");
        

	}


	public static void prettyPrintHisto(int[] histo, String fileName) {
		String filepath = "images/histo-" + fileName + ".txt";
		if (histo == null) {
			System.out.println("La méthode de calcul de l'histogramme n'a pas encore été implémentée.");
			return;
		}
		String s = "";
		for (int i = 0; i < histo.length; i++) {
			int k = histo[i];
			s += "| ";
			if (k == 0) {
				s += "      ";
			} else if (k < 10) {
				s += "   " + k + "  ";
			} else if (k < 100) {
				s += "  " + k + "  ";
			} else if (k < 1000) {
				s += "  " + k + " ";
			} else if (k < 10000) {
				s += " " + k + " ";
			} else if (k < 100000) {
				s += " " + k;
			} else {
				s += k;
			}
			s += " ";
		}
		s += "|\n";

		for (int i = 0; i < histo.length; i++) {
			s += "|---";
			if (i < 10) {
				s += "00" + i;
			} else if (i < 100) {
				s += "0" + i;
			} else {
				s += "" + i;
			}
			s += "--";
		}

		s += "|\n";

		try {
			FileOutputStream fichier = new FileOutputStream(filepath, true);
			fichier.write(s.getBytes());
			fichier.close();

		} catch (IOException e) {
			System.out.println("Impossible d'écrire l'histogramme dans le fichier " + filepath);
			System.out.println(s);
		}

	}

}
