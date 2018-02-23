package application.model;

public enum Localisation {

	FORET("Forêt"), MARECAGE("Marécage"), MONTAGNE("Montagne"), PLAGE("Plage"), AQUATIQUE("Aquatique"), PLAINE(
			"Plaine"), SOUSTERRAIN("Sous-terrain"), URBAIN("Urbain");

	private String name;

	Localisation(String str) {
		this.name = str;
	}

	@Override
	public String toString() {
		return name;
	}

}
