package ru.fignigno.sfgpetclinic.data.services.map;

import ru.fignigno.sfgpetclinic.data.model.Pet;
import ru.fignigno.sfgpetclinic.data.services.CrudService;
import ru.fignigno.sfgpetclinic.data.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
