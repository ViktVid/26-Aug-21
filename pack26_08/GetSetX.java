package pack26_08;

public class GetSetX {

	public String ime;

	private int predjeniKm;

	public GetSetX() {

	}

	public void stampanje() {
		System.out.println("Auto " + ime + "je presao " + getPredjeniKm() + " kilometara.");
	}

	public void setPredjeniKm(int km) {
		this.predjeniKm = km;
	}

	public int getPredjeniKm() {
		return this.predjeniKm;
	}
}
