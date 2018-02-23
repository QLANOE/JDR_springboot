package application.model;

public class ObjetCombat extends BonusObjet {

	private int armure;
	private De degat;

	public ObjetCombat() {
		super();
	}

	public ObjetCombat(int armure) {
		super();
		this.armure = armure;
	}

	public ObjetCombat(De degat) {
		super();
		this.degat = degat;
	}

	public ObjetCombat(int armure, De degat) {
		super();
		this.armure = armure;
		this.degat = degat;
	}

	public int getArmure() {
		return armure;
	}

	public void setArmure(int armure) {
		this.armure = armure;
	}

	public De getDegat() {
		return degat;
	}

	public void setDegat(De degat) {
		this.degat = degat;
	}

}
