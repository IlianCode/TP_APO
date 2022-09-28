package signal;

import tools.JavaPlot;

public class TestSignal {

	public static void main(String[] args) {

		// Affichage du signal d'entrée
		double[] signal = Signal.getSignalEntree();
		JavaPlot.affiche("entrée", signal);
        
        /*
		FiltreRect filtre = new FiltreRect(10);
		filtre.afficher();

		double[] signalFiltre = filtre.appliquerFiltre(signal);
		JavaPlot.affiche("signal filtré", signalFiltre);
        */
	}

}
