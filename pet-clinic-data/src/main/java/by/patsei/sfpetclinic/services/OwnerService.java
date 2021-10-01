package by.patsei.sfpetclinic.services;

import by.patsei.sfpetclinic.model.Owner;

import java.util.List;
import java.util.Set;

public interface OwnerService extends CrudService <Owner, Long> {

    List<Owner> findAllByLastNameLike(String lastName);


}
