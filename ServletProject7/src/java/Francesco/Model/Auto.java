package Francesco.Model;

public class Auto {

	private String targa;
	private String proprietario;

	public Auto() {
		super();
	}

	public Auto(String targa, String proprietario) {
		super();
		this.targa = targa;
		this.proprietario = proprietario;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

}
