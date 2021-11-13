package pack26_08;

public class Konstruktor {
	public static void main(String[] args) {

	Automobil auto2 = new Automobil("Neki automobil", "Neke marke", 4, 2009, 1500/*,10*/ );
	
	auto2.setPredjeniKm(9000);
	
	auto2.setPotrosnjaGoriva(10);
	auto2.stampanje();

	
	//System.out.println(auto2.getPredjeniKm());	
	
/*
Dodati private atribut "predjeniKm", napraviti geter i seter i odstampati posebno ili zajedno sa prethodnom stampom.
Raditi u klasi gde je pun konstruktor */
		
	}
}
