package application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Objet {

	@Id
	@GeneratedValue
	private Long id;

	private String nom;
	private String description;
	private int prix;

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

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
