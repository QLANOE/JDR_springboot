package application.model;

public class Monstre extends Personnage {

	private Localisation localisation;

	public Monstre(Localisation localisation) {
		super();
		this.localisation = localisation;
	}

	public Localisation getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Localisation localisation) {
		this.localisation = localisation;
	}

}
