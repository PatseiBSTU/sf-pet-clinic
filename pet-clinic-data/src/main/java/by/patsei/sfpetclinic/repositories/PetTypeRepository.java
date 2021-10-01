package by.patsei.sfpetclinic.repositories;

import by.patsei.sfpetclinic.model.Owner;
import by.patsei.sfpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
