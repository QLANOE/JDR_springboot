package application.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Personnage;
import application.service.PersonnageService;

@Controller
@RequestMapping("/jdr/perso")
public class PersonnageController {

	@Autowired
	PersonnageService personnageService;

	@PostMapping
	public Personnage save(@RequestBody Personnage user) {
		return personnageService.ajouterPersonnage(user.getNom(), user.getDescription());

	}

	@GetMapping
	public List<Personnage> listerPersonnage() {
		return personnageService.listerPerso();

	}

	@RequestMapping("/id/{id}")
	public Personnage afficherUser(@PathVariable(value = "id") Long id, HttpServletResponse response) {

		Personnage savedUser = personnageService.chercherPersonnage(id);
		if (savedUser == null) {
			response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		}
		return savedUser;
	}

	@RequestMapping("/login/{login}")
	public Personnage afficherUserParLogin(@PathVariable(value = "login") String nom) {

		return personnageService.chercherPersonnageParNom(nom);
	}

	@RequestMapping("/supprId/{supprId}")
	public void supprimerUser(@PathVariable(value = "supprId") Long supprId) {

		personnageService.supprimmerPersonnage(supprId);
	}

	@GetMapping("/{Id}")
	public Personnage modifierUser(@RequestBody Personnage user, @PathVariable(value = "Id") Long id) {

		return personnageService.modifierPersonnage(user.getNom(), user.getDescription(), id);
	}

}
