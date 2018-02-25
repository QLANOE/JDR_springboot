package application.form;

import java.util.List;

import javax.validation.constraints.Size;

import application.model.Competence;
import application.model.Don;
import application.model.Objet;
import application.model.Personnage;
import application.model.Posture;

public class PersonnageForm {

	@Size(min = 3)
	private String nom;
	private int niveau;
	private List<Competence> statPrimaire;
	private List<Competence> statSecondaire;
	private List<Competence> competences;
	@Size(min = 20)
	private String description;
	private int vieActuelle;
	private int vieMax;
	private int psyActuelle;
	private int psyMax;
	private String langue;
	private Posture postureBase;
	private List<Objet> equipement;
	private List<Don> dons;

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

	public List<Competence> getStatPrimaire() {
		return statPrimaire;
	}

	public void setStatPrimaire(List<Competence> statPrimaire) {
		this.statPrimaire = statPrimaire;
	}

	public List<Competence> getStatSecondaire() {
		return statSecondaire;
	}

	public void setStatSecondaire(List<Competence> statSecondaire) {
		this.statSecondaire = statSecondaire;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVieActuelle() {
		return vieActuelle;
	}

	public void setVieActuelle(int vieActuelle) {
		this.vieActuelle = vieActuelle;
	}

	public int getVieMax() {
		return vieMax;
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}

	public int getPsyActuelle() {
		return psyActuelle;
	}

	public void setPsyActuelle(int psyActuelle) {
		this.psyActuelle = psyActuelle;
	}

	public int getPsyMax() {
		return psyMax;
	}

	public void setPsyMax(int psyMax) {
		this.psyMax = psyMax;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Posture getPostureBase() {
		return postureBase;
	}

	public void setPostureBase(Posture postureBase) {
		this.postureBase = postureBase;
	}

	public List<Objet> getEquipement() {
		return equipement;
	}

	public void setEquipement(List<Objet> equipement) {
		this.equipement = equipement;
	}

	public List<Don> getDons() {
		return dons;
	}

	public void setDons(List<Don> dons) {
		this.dons = dons;
	}

	public Personnage personnageFormToPersonnage() {

		Personnage personnage = new Personnage();
		personnage.setNom(nom);
		personnage.setDescription(description);
		personnage.setNiveau(niveau);
		personnage.setStatPrimaire(statPrimaire);
		personnage.setStatSecondaire(statSecondaire);
		personnage.setCompetences(competences);
		personnage.setDons(dons);
		personnage.setPostureBase(postureBase);
		personnage.setEquipement(equipement);
		personnage.setLangue(langue);
		personnage.setPsyMax(psyMax);
		personnage.setVieMax(vieMax);

		return personnage;
	}

}
