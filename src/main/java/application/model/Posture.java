package application.model;

public enum Posture {

	OFFENSIVE("Posture offensive"), DEFENSIVE("Posture d�fensive"), FOCUS("Posture de focus");

	private String name;

	Posture(String str) {
		this.name = str;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
