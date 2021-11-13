package pack26_08;

public class Automobil {

	/*
	 * -Napraviti klasu automobil i dve main klase gde ce se u jednoj stampati
	 * podaci preko praznog konstruktora, a u drugom preko punog konstruktora.
	 * Atributi su: marka, model, pogon, broj vrata i godiste. -Dodati atribute
	 * "potrosnjaGoriva" (int) i "kubikaza" (int). Ako kubikaza prelazi 1000 cm^3
	 * onda stampati potrosnju da je 10 litara, ako je kubikaza ispod 1000 onda
	 * stampati da je potrosnja 8 litara.
	 */

	public String marka;
	public String model;
	public int brojVrata;
	public int godiste;
	private int predjeniKm;
	public int kubikaza;
	private int potrosnjaGoriva;

	

	// Zaboravila sam pogon.

	public Automobil(String marka, String model, int brojVrata, int godiste, int kubikaza/*, int potrosnjaGoriva*/) {
		this.marka = marka;
		this.model = model;
		this.brojVrata = brojVrata;
		this.godiste = godiste;
		this.kubikaza = 1500;
	//	this.potrosnjaGoriva = 10;

	}

	public Automobil() {

	}

	public void stampanje() {

		System.out.println("Marka automobila je: " + marka + ";\nModel automobila je: " + model
				+ ";\nBroj vrata na automobilu je: " + brojVrata + "\nGodiste automobila je: " + godiste
				+ "\nKilometraza je: " + getPredjeniKm() + "\nKubikaza auta je: " + kubikaza
				+ "\nPotrosnja goriva je: " + potrosnjaGoriva);
	}

	public void setPredjeniKm(int predjeniKm) {
		this.predjeniKm = predjeniKm;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}
	
	public void setPotrosnjaGoriva(int potrosnjaGoriva) {
		this.potrosnjaGoriva = potrosnjaGoriva;
	}
	
	public int getPotrosnjaGoriva() {
		return this.potrosnjaGoriva;
	}
	
}

