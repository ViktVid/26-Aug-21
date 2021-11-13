package pack26_08;

public class BezKonstruktora {
	public static void main (String [] args) {
		
		Automobil auto = new Automobil();
		
		auto.marka = "Neka marka";
		auto.model = "Neki model";
		auto.brojVrata = 4;
		auto.godiste = 2009;
		auto.kubikaza = 1500;
//		auto.potrosnjaGoriva = 10;
		
		auto.stampanje();
	}

}
// Tamo gde je objekat - tu je main metoda.
// Gde su atributi - NIJE main metoda!