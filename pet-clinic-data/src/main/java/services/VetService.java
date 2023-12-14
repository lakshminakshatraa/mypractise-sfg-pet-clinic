package services;

import guru.springframework.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long>{
    Vet save(Vet vet);
}
