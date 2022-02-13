package ru.fignigno.sfgpetclinic.data.services.map;

import ru.fignigno.sfgpetclinic.data.model.Vet;
import ru.fignigno.sfgpetclinic.data.services.CrudService;
import ru.fignigno.sfgpetclinic.data.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
