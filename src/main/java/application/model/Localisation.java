package application.model;

public enum Localisation {

	FORET("For�t"), MARECAGE("Mar�cage"), MONTAGNE("Montagne"), PLAGE("Plage"), AQUATIQUE("Aquatique"), PLAINE(
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
