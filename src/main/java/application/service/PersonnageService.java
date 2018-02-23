package application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Personnage;
import application.repository.PersonnageRepository;

@Service
public class PersonnageService {

	@Autowired
	PersonnageRepository personnageRepository;

	public List<Personnage> listerPerso() {
		List<Personnage> persos = (List<Personnage>) personnageRepository.findAll();
		return persos;
	}

	public Personnage ajouterPersonnage(String nom, String description) {

		Personnage perso = new Personnage();
		perso.setNom(nom);
		perso.setDescription(description);
		personnageRepository.save(perso);
		System.out.println("perso enregistré");

		return perso;
	}

}
