package ru.fignigno.sfgpetclinic.data.services;

import ru.fignigno.sfgpetclinic.data.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
