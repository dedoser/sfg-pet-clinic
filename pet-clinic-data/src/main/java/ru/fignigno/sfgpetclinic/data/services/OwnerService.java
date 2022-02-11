package ru.fignigno.sfgpetclinic.data.services;

import ru.fignigno.sfgpetclinic.data.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
