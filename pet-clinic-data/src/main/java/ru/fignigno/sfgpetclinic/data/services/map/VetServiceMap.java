package ru.fignigno.sfgpetclinic.data.services.map;

import org.springframework.stereotype.Service;
import ru.fignigno.sfgpetclinic.data.model.Speciality;
import ru.fignigno.sfgpetclinic.data.model.Vet;
import ru.fignigno.sfgpetclinic.data.services.CrudService;
import ru.fignigno.sfgpetclinic.data.services.SpecialityService;
import ru.fignigno.sfgpetclinic.data.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if (object != null) {
            if (object.getSpecialities() != null) {
                object.getSpecialities().forEach(spec -> {
                    if (spec.getId() == null) {
                        spec.setId(specialityService.save(spec).getId());
                    }
                });
            }
        }
        return super.save(object);
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
