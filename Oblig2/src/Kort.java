import java.util.GregorianCalendar;

public abstract class Kort implements Comparable<Kort>, Cloneable {
	private GregorianCalendar dateCreated;
	private String fornavn;
	private String etternavn;
	protected int pin;
	private int kortnummer;
	private int aksesskode;
	private boolean sperretKort;
	private static int antallKort = 100000;

	public Kort(String fornavn, String etternavn, int pin) {
		super();
		this.dateCreated = new GregorianCalendar();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.pin = pin;
		this.kortnummer = ++antallKort;
		this.aksesskode = aksesskode;
		this.sperretKort = false;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public GregorianCalendar getDateCreated() {
		return dateCreated;
	}

	public boolean isSperret() {
		return sperretKort;
	}

	public void setSperretKort(boolean sperretKort) {
		this.sperretKort = sperretKort;
	}

	public abstract boolean sjekkPIN(int pin);

	@Override
	public int compareTo(Kort n) {
		int alfabetisk = this.getEtternavn().compareTo(n.getEtternavn());
			if (alfabetisk == 0) {
				alfabetisk = this.getFornavn().compareTo(n.getFornavn());
			}
			return alfabetisk;
	}
			
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Kort \nOpprettet: " + dateCreated.getTime() + "\nNavn: " + fornavn + " " + etternavn + "\nPin: " + pin
				+ "\nKortnummer: " + kortnummer + "\nAksesskode: " + aksesskode + "\nSperret: " + sperretKort + "\n\n";
	}

	public String hentEtternavn() {
		// TODO Auto-generated method stub
		return null;
	}


}