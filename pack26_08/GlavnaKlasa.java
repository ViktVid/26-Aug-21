package pack26_08;

import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {

	//	Scanner sc = new Scanner(System.in);
		
	PolaznikKursa1 polaznik1 = new PolaznikKursa1();
	
	polaznik1.idPolaznika = 1;
	polaznik1.imePolaznika = "Lazar";
	polaznik1.prezimePolaznika = "Markovic";
	polaznik1.prosekOcena = 9.0;
	
	polaznik1.stampanjePodataka();
	
	PolaznikKursa1 polaznik2 = new PolaznikKursa1();
	polaznik2.idPolaznika = 2;
	polaznik2.imePolaznika = "Jelena";
	polaznik2.prezimePolaznika = "Markovic";
	polaznik2.godinaRodjenja = 1995;
	polaznik2.prosekOcena = 10.0;
	
	polaznik2.stampanjePodataka();
	
	PolaznikKursa1 polaznik3 = new PolaznikKursa1(3, "Petar", "Filipovic",
			+ 1999, 7.1);
	polaznik3.stampanjePodataka();

	}

}
