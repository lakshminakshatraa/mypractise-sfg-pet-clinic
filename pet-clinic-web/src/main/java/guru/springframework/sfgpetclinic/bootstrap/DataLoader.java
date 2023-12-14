package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerMapService;
import services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setFirstName("Blue");
        owner1.setLastName("Jewel");
        owner1.setId(1L);
        ownerService.save(owner1);
        System.out.println("Saved owner..");

        Vet vet1=new Vet();
        vet1.setFirstName("Hakuna");
        vet1.setLastName("Matada");
        vet1.setId(1L);
        vetService.save(vet1);
        System.out.println("Saved vet");
    }
}
