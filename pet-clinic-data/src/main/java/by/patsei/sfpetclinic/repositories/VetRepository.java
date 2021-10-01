package by.patsei.sfpetclinic.repositories;

import by.patsei.sfpetclinic.model.Vet;
import by.patsei.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
