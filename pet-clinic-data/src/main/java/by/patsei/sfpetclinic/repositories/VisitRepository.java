package by.patsei.sfpetclinic.repositories;

import by.patsei.sfpetclinic.model.Speciality;
import by.patsei.sfpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
