package application.model;

public class De {

	private int nbFaces;

	public De() {
	}

	public int getNbFaces() {
		return nbFaces;
	}

	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}

	public int jetDe() {

		int jet = 0;
		jet = (int) Math.floor(Math.random() * nbFaces + 1);

		return jet;
	}

}
