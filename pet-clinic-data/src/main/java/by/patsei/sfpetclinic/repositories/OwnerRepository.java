package by.patsei.sfpetclinic.repositories;

import by.patsei.sfpetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends    CrudRepository<Owner, Long> {

    List<Owner> findAllByLastNameLike(String lastName);


}
