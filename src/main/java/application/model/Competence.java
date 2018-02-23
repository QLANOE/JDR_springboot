package application.model;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Competence {

	@Id
	@GeneratedValue
	private Long Id;

	private String nom;
	private int niveau;

	public Competence() {
	}

	public Competence(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public void editerCompetence() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom de la compétence");
		nom = sc.nextLine();
		System.out.println("Veuillez saisir la valeur de la compétence");
		niveau = sc.nextInt();
	}

	@Override
	public String toString() {
		return this.nom + " est à " + this.niveau + "%.";
	}

}
