package application.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Personnage {

	@Id
	@GeneratedValue
	private Long id;

	private String nom;
	private int niveau;
	@OneToMany
	private List<Competence> statPrimaire;
	@OneToMany
	private List<Competence> statSecondaire;
	@OneToMany
	private List<Competence> competences;
	private String description;
	private int vieActuelle;
	private int vieMax;
	private int psyActuelle;
	private int psyMax;
	private String langue;
	@Enumerated(EnumType.STRING)
	private Posture postureBase;
	@OneToMany
	private List<Objet> equipement;
	@OneToMany
	private List<Don> dons;

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public List<Competence> getStatPrimaire() {
		return statPrimaire;
	}

	public List<Competence> getStatSecondaire() {
		return statSecondaire;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public String getDescription() {
		return description;
	}

	public int getVieActuelle() {
		return vieActuelle;
	}

	public int getVieMax() {
		return vieMax;
	}

	public int getPsyActuelle() {
		return psyActuelle;
	}

	public int getPsyMax() {
		return psyMax;
	}

	public String getLangue() {
		return langue;
	}

	public Posture getPostureBase() {
		return postureBase;
	}

	public List<Objet> getEquipement() {
		return equipement;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public void setStatPrimaire(List<Competence> statPrimaire) {
		this.statPrimaire = statPrimaire;
	}

	public void setStatSecondaire(List<Competence> statSecondaire) {
		this.statSecondaire = statSecondaire;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setVieActuelle(int vieActuelle) {
		this.vieActuelle = vieActuelle;
	}

	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
	}

	public void setPsyActuelle(int psyActuelle) {
		this.psyActuelle = psyActuelle;
	}

	public void setPsyMax(int psyMax) {
		this.psyMax = psyMax;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public void setPostureBase(Posture postureBase) {
		this.postureBase = postureBase;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String competenceToString(List<Competence> competences) {
		String str = null;
		for (int i = 0; i < competences.size(); i++) {

			str += "\n" + competences.get(i).toString();
		}
		return str;
	}

	@Override
	public String toString() {
		return "Le nom du personnage est " + this.nom + "\n son niveau est de " + this.niveau
				+ "\n sa description est :\n" + this.description + "\n ses statistiques primaire sont:"
				+ competenceToString(this.statPrimaire) + "\n ses statistiques secondaires sont: "
				+ competenceToString(this.statSecondaire) + "\n ses comp�tences sont: "
				+ competenceToString(this.competences) + "\n sa posture de base est la " + this.postureBase.toString()
				+ "\n il parle le " + this.langue + "\n ses points de vie sont de " + this.vieMax + " PV et il a "
				+ this.psyMax + " points de psy";
	}

}
