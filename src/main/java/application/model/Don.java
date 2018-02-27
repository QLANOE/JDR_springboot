package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Don {

	@Id
	@GeneratedValue
	private Long id;

	private String nom;
	private String description;
	private int coutPsy;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCoutPsy() {
		return coutPsy;
	}

	public void setCoutPsy(int coutPsy) {
		this.coutPsy = coutPsy;
	}

	public Don(String nom, String description, int coutPsy) {
		this.nom = nom;
		this.description = description;
		this.coutPsy = coutPsy;
	}

	public Don() {
	}

}
