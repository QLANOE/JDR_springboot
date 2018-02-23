package application.model;

public class Bonus {

	private int armure;
	private int degat;
	private int vie;
	private int psy;
	private Competence competence;

	public int getArmure() {
		return armure;
	}

	public void setArmure(int armure) {
		this.armure = armure;
	}

	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getPsy() {
		return psy;
	}

	public void setPsy(int psy) {
		this.psy = psy;
	}

	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

}
