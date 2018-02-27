package application.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import application.model.Personnage;
import application.repository.PersonnageRepository;
import application.service.PersonnageService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonnagesServicesTests {

	@Autowired
	PersonnageRepository personnageRepository;

	@Autowired
	PersonnageService personnageServices;

	@Test
	public void creationPersonnage() {

		String nom = "roger";
		String description = "description";

		Personnage persoCreated = personnageServices.ajouterPersonnage(nom, description);

		assertThat(persoCreated).isNotNull();
		assertThat(persoCreated.getNom().equals(nom)).isTrue();

		Personnage userSaved = personnageServices.chercherPersonnage(persoCreated.getId());
		assertThat(userSaved).isNotNull();
		assertThat(userSaved.getNom().equals(nom)).isTrue();

	}

	@Test
	public void suppressionPersonnage() {
		String nom = "bob";
		String description = "bobby";

		Personnage persoCreated = personnageServices.ajouterPersonnage(nom, description);
		assertThat(persoCreated).isNotNull();
		assertThat(persoCreated.getNom().equals(nom)).isTrue();

		personnageServices.supprimmerPersonnage(persoCreated.getId());
		Personnage persoSupprimer = personnageServices.chercherPersonnage(persoCreated.getId());
		assertThat(persoSupprimer).isNull();
	}

	@Test
	public void modifierPersonnage() {
		String nom = "truc";
		String description = "muche";

		Personnage persoCreated = personnageServices.ajouterPersonnage(nom, description);
		assertThat(persoCreated).isNotNull();
		assertThat(persoCreated.getNom().equals(nom)).isTrue();

		String nomModifiee = "bidule";
		String descriptionModifiee = "machin";

		Personnage persoModifie = personnageServices.modifierPersonnage(nomModifiee, descriptionModifiee,
				persoCreated.getId());
		assertThat(persoModifie.getNom().equals(nomModifiee)).isTrue();
	}

}
