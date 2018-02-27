package application.model;

import java.util.Random;

public class De {

	private int nbFaces;

	public De() {
	}

	public De(int nbFaces) {
		this.nbFaces = nbFaces;
	}

	public int getNbFaces() {
		return nbFaces;
	}

	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}

	public int jetDe() {

		Random r = new Random();
		return r.nextInt(nbFaces - 1) + 1;

	}

}
