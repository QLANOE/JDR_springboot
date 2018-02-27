package application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import application.model.Personnage;

@Repository
public interface PersonnageRepository extends CrudRepository<Personnage, Long> {

	Personnage findPersonnageByNom(String nom);

}
