package application.metier;

import application.model.Personnage;

public class GestionPersonnage {

	private CreationPerso creation = new CreationPerso();

	public Personnage creationPersonnageLvl1() {

		Personnage personnage = new Personnage();

		creation.saisirDonneesPersonnageLvl1(personnage);
		creation.choisirStatsPrincipalesLvl1(personnage);
		creation.choisirStatSecondaireLvl1(personnage);
		creation.choisirCompetencesLvl1(personnage);
		creation.choixDons(personnage);

		return personnage;

	}

	public Personnage creationPersonnage() {

		Personnage personnage = new Personnage();

		creation.saisirDonneesPersonnage(personnage);
		creation.choisirStatsPrincipales(personnage);
		creation.choisirStatsSecondaires(personnage);
		creation.choisirCompetences(personnage);
		creation.choixDons(personnage);

		return personnage;
	}

	public Personnage testFonctionalite() {

		Personnage personnage = new Personnage();

		creation.choisirStatsPrincipalesLvl1(personnage);
		int[] tab = creation.determinerSommeStatSecondaire(personnage);
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i] + "");
		}

		return personnage;
	}

}
