package application.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.form.PersonnageForm;
import application.model.Personnage;
import application.service.PersonnageService;

@RestController
@RequestMapping("/api/perso")
public class PersonnageRestController {

	@Autowired
	PersonnageService personnageService;

	@GetMapping
	public String accueilPersonnage(Model model) {
		return "accueilPersonnage";
	}

	@GetMapping("/creation")
	public String listerUser(Model model) {
		return "creation";
	}

	@PostMapping("/sauvegardePerso")
	public String sauvegarderPersonnage(Model model, @ModelAttribute("Personnage") PersonnageForm persoForm,
			BindingResult result) {

		Personnage perso = persoForm.personnageFormToPersonnage();
		personnageService.ajouterPersonnage(perso.getNom(), perso.getDescription());
		return "redirect:/jdr/perso";
	}

}
