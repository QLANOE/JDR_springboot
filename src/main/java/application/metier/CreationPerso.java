package application.metier;

import java.util.ArrayList;
import java.util.Scanner;

import application.model.Competence;
import application.model.Don;
import application.model.Personnage;
import application.model.Posture;

public class CreationPerso {

	public void choisirStatsPrincipalesLvl1(Personnage personnage) {

		int sommeStat = 0;
		do {

			choisirStatsPrincipales(personnage);
			sommeStat = personnage.getStatPrimaire().get(0).getNiveau()
					+ personnage.getStatPrimaire().get(1).getNiveau() + personnage.getStatPrimaire().get(2).getNiveau();
			if (sommeStat != 170) {
				System.out.println("La somme des valeurs des statistiques primaires doit �tre �gal � 170.");
			}

		} while (sommeStat != 170);

	}

	public void choisirStatsPrincipales(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Competence> statPrimaire = creerStatsPrincipales();

		for (int i = 0; i < 3; i++) {
			System.out.println("Veuillez saisir la valeur pour le " + statPrimaire.get(i).getNom());
			statPrimaire.get(i).setNiveau(sc.nextInt());
		}

		personnage.setStatPrimaire(statPrimaire);
	}

	public ArrayList<Competence> creerStatsPrincipales() {

		ArrayList<Competence> statPrimaire = new ArrayList<>();
		Competence physique = new Competence("Physique");
		Competence social = new Competence("Social");
		Competence mental = new Competence("Mental");

		statPrimaire.add(physique);
		statPrimaire.add(social);
		statPrimaire.add(mental);
		return statPrimaire;

	}

	public ArrayList<Competence> creerStatSecondaires() {

		ArrayList<Competence> statSecondaires = new ArrayList<>();
		Competence force = new Competence("Force");
		Competence agilite = new Competence("Agilit�");
		Competence endurance = new Competence("Endurance");
		Competence charisme = new Competence("Charisme");
		Competence apparence = new Competence("Apparence");
		Competence truc = new Competence("Truc");
		Competence intelligence = new Competence("Intelligence");
		Competence volonte = new Competence("Volont�");
		Competence sagesse = new Competence("Sagesse");

		statSecondaires.add(force);
		statSecondaires.add(agilite);
		statSecondaires.add(endurance);
		statSecondaires.add(charisme);
		statSecondaires.add(apparence);
		statSecondaires.add(truc);
		statSecondaires.add(intelligence);
		statSecondaires.add(volonte);
		statSecondaires.add(sagesse);

		return statSecondaires;
	}

	public void choisirStatsSecondaires(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Competence> statSecondaire = creerStatSecondaires();

		for (int i = 0; i < statSecondaire.size(); i++) {
			System.out.println("Veuillez saisir la valeur pour le " + statSecondaire.get(i).getNom());
			statSecondaire.get(i).setNiveau(sc.nextInt());
		}

		personnage.setStatSecondaire(statSecondaire);
		;
	}

	public int choisirStatsSecondairesPar3(Personnage personnage, int index) {

		Scanner sc = new Scanner(System.in);
		int somme = 0;

		for (int i = index * 3; i < (index * 3) + 3; i++) {
			System.out.println("Veuillez saisir la valeur pour le " + personnage.getStatSecondaire().get(i).getNom());
			personnage.getStatSecondaire().get(i).setNiveau(sc.nextInt());
			somme += personnage.getStatSecondaire().get(i).getNiveau();
		}

		return somme;
	}

	public void choisirStatSecondaireLvl1(Personnage personnage) {

		int[] sommeStat = determinerSommeStatSecondaire(personnage);
		personnage.setStatSecondaire(creerStatSecondaires());

		for (int i = 0; i < sommeStat.length; i++) {
			int somme = 0;
			while (somme != sommeStat[i]) {

				somme = choisirStatsSecondairesPar3(personnage, i);
				if (somme != sommeStat[i]) {
					System.out.println("La valeur n'est pas bonne, veuillez ressaisir les valeurs");
				}
			}
		}

	}

	public int[] determinerSommeStatSecondaire(Personnage personnage) {

		int[] sommeStatSecondaire = new int[3];
		for (int i = 0; i < personnage.getStatPrimaire().size(); i++) {
			Integer calcul = (int) (personnage.getStatPrimaire().get(i).getNiveau() / 10);
			calcul = (int) (calcul + Math.floor(calcul.doubleValue() / 2));
			sommeStatSecondaire[i] = calcul;

		}

		return sommeStatSecondaire;
	}

	public void choisirCompetencesLvl1(Personnage personnage) {

		ArrayList<Competence> competences = new ArrayList<>();
		boolean bienrempli = false;
		while (bienrempli == false) {

			int sommeStat = 0;
			while (sommeStat != 60 && sommeStat < 60) {
				Competence competence = new Competence();
				competence.editerCompetence();
				sommeStat = sommeStat + competence.getNiveau();
				competences.add(competence);
			}
			if (sommeStat != 60) {
				bienrempli = false;
				System.out.println("La somme des comp�tences doit �tre �gale � 60.");
				competences.clear();
			} else {
				bienrempli = true;
			}
		}
		personnage.setCompetences(competences);
	}

	public void choisirCompetences(Personnage personnage) {

		ArrayList<Competence> competences = new ArrayList<>();
		String str;
		Scanner sc = new Scanner(System.in);
		do {
			Competence competence = new Competence();
			competence.editerCompetence();
			competences.add(competence);
			System.out.println("Voulez-vous continuer?\n oui/non");
			str = sc.nextLine();
		} while (str.equals("oui"));

		personnage.setCompetences(competences);
	}

	public void saisirDonneesPersonnage(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		saisirNomDescriptionLangue(personnage, sc);
		System.out.println("Veuillez saisir le niveau du personnage");
		personnage.setNiveau(sc.nextInt());
		choixPosture(personnage, sc);
		saisirVieEtPsy(personnage, sc);
	}

	public void saisirDonneesPersonnageLvl1(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		saisirNomDescriptionLangue(personnage, sc);
		choixPosture(personnage, sc);
		personnage.setNiveau(1);
		while ((personnage.getVieMax() + personnage.getPsyMax()) != 10)
			saisirVieEtPsy(personnage, sc);
		if ((personnage.getVieMax() + personnage.getPsyMax()) != 10) {
			System.out.println("La somme de la vie et de la psy n'est pas �gale a 10.");
		}
	}

	public void saisirNomDescriptionLangue(Personnage personnage, Scanner sc) {
		System.out.println("veuillez saisir le nom du personnage");
		personnage.setNom(sc.nextLine());
		System.out.println("veuillez saisir la description de votre personnage");
		personnage.setDescription(sc.nextLine());
		System.out.println("Veuillez saisir les langues de votre personnage");
		personnage.setLangue(sc.nextLine());
	}

	public void saisirVieEtPsy(Personnage personnage, Scanner sc) {
		System.out.println("Veuillez choisir la vie max de votre personnage");
		personnage.setVieMax(sc.nextInt());
		System.out.println("Veuillez choisir la psy max de votre personnage");
		personnage.setPsyMax(sc.nextInt());
		personnage.setVieActuelle(personnage.getVieMax());
		personnage.setPsyActuelle(personnage.getPsyMax());
	}

	public void choixPosture(Personnage personnage, Scanner sc) {
		System.out.println(
				"Veuillez choisir la posture de base de votre personnage \n 1-Posture offensive\n 2-Posture D�fensive\n 3-Posture de focus");
		boolean saisieBonne = false;
		while (saisieBonne == false) {
			saisieBonne = true;
			int index = sc.nextInt();
			switch (index) {
			case 1:
				personnage.setPostureBase(Posture.OFFENSIVE);
				break;
			case 2:
				personnage.setPostureBase(Posture.DEFENSIVE);
				break;
			case 3:
				personnage.setPostureBase(Posture.FOCUS);
				break;
			default:
				System.out.println("Vous n'avez pas saisi un chiffre valide");
				System.out.println(
						"Veuillez choisir la posture de base de votre personnage \n 1-Posture offensive\n 2-Posture D�fensive\n 3-Posture de focus");
			}
		}
	}

	public void choixDons(Personnage personnage) {

		Scanner sc = new Scanner(System.in);
		String y;
		personnage.setDons(new ArrayList<>());
		do {
			System.out.println("veuillez saisir le nom du don");
			String nom = sc.nextLine();
			System.out.println("Veuillez saisir la description du don");
			String description = sc.nextLine();
			System.out.println("Veuillez saisir le cout en psy");
			int cout = sc.nextInt();
			sc.nextLine();
			personnage.getDons().add(new Don(nom, description, cout));
			System.out.println("voulez vous cr�er un nouveau don? Y/N");
			y = sc.nextLine();
		} while (y.equals("y"));

	}

}
