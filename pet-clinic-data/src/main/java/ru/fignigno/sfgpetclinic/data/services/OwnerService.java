package ru.fignigno.sfgpetclinic.data.services;

import ru.fignigno.sfgpetclinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
