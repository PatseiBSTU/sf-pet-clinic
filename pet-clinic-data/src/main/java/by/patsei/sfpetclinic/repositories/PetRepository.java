package by.patsei.sfpetclinic.repositories;

import by.patsei.sfpetclinic.model.Owner;
import by.patsei.sfpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
