package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Personnage;
import application.service.PersonnageService;

@Controller
@RequestMapping("/jdr/perso")
public class PersonnageController {

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
	public String sauvegarderPersonnage(Model model, @ModelAttribute("Personnage") Personnage perso,
			BindingResult result) {

		personnageService.ajouterPersonnage(perso.getNom(), perso.getDescription());
		return "redirect:/jdr/perso";
	}

}
