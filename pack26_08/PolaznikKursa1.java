package pack26_08;

public class PolaznikKursa1 {
	public int idPolaznika;
	public String imePolaznika;
	public String prezimePolaznika;
	public int godinaRodjenja;
	public double prosekOcena;

	public PolaznikKursa1(int id, String ime, String prezime, int godina, double prosek) {
		this.idPolaznika = id;
		this.imePolaznika = ime;
		this.prezimePolaznika = prezime;
		this.godinaRodjenja = godina;
		this.prosekOcena = prosek;
	}
public PolaznikKursa1 () {
}

	public void stampanjePodataka() {

		System.out.println("ID polaznika je " + idPolaznika + ", ime i prezime polaznika je: " + imePolaznika + " "
				+ prezimePolaznika + " rodjen je: " + godinaRodjenja + ". godine i ima prosek ocena: " + prosekOcena);
	}
}
