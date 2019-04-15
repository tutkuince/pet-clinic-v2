package com.muditasoft.petclinicv2.bootstrap;

import com.muditasoft.petclinicv2.model.Owner;
import com.muditasoft.petclinicv2.model.Vet;
import com.muditasoft.petclinicv2.service.OwnerService;
import com.muditasoft.petclinicv2.service.VetService;
import com.muditasoft.petclinicv2.service.map.OwnerMapService;
import com.muditasoft.petclinicv2.service.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Tutku");
        owner1.setLastName("Ince");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Emin");
        owner2.setLastName("Koklu");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ugur");
        vet1.setLastName("Batikan");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Alp");
        vet2.setLastName("Colpanlar");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
