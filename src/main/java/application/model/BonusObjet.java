package application.model;

public class BonusObjet extends Objet {

	private int bonusArmure;
	private int bonusDegat;
	private int bonusVie;
	private int bonusPsy;
	private Competence bonusCompetence;

	public int getBonusArmure() {
		return bonusArmure;
	}

	public void setBonusArmure(int bonusArmure) {
		this.bonusArmure = bonusArmure;
	}

	public int getBonusDegat() {
		return bonusDegat;
	}

	public void setBonusDegat(int bonusDegat) {
		this.bonusDegat = bonusDegat;
	}

	public int getBonusVie() {
		return bonusVie;
	}

	public void setBonusVie(int bonusVie) {
		this.bonusVie = bonusVie;
	}

	public int getBonusPsy() {
		return bonusPsy;
	}

	public void setBonusPsy(int bonusPsy) {
		this.bonusPsy = bonusPsy;
	}

	public Competence getBonusCompetence() {
		return bonusCompetence;
	}

	public void setBonusCompetence(Competence bonusCompetence) {
		this.bonusCompetence = bonusCompetence;
	}

}
