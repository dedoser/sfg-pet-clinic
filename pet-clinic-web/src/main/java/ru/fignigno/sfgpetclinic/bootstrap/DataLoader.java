package ru.fignigno.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.fignigno.sfgpetclinic.data.model.Owner;
import ru.fignigno.sfgpetclinic.data.model.Pet;
import ru.fignigno.sfgpetclinic.data.model.PetType;
import ru.fignigno.sfgpetclinic.data.model.Vet;
import ru.fignigno.sfgpetclinic.data.services.OwnerService;
import ru.fignigno.sfgpetclinic.data.services.PetTypeService;
import ru.fignigno.sfgpetclinic.data.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 moscow");
        owner1.setCity("Moscow");
        owner1.setTelephone("987654321");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDog);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rocky");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner1.setAddress("123 moscow");
        owner1.setCity("Moscow");
        owner1.setTelephone("987654321");

        Pet fionaCat = new Pet();
        fionaCat.setPetType(savedCat);
        fionaCat.setName("Shrek");
        fionaCat.setBirthDate(LocalDate.now().minusDays(1));
        fionaCat.setOwner(owner2);
        owner2.getPets().add(fionaCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");


    }
}
