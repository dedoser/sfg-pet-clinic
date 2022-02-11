package ru.fignigno.sfgpetclinic.data.services;

import ru.fignigno.sfgpetclinic.data.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
