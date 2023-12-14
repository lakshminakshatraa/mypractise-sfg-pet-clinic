package services;

public interface OwnerService <Owner,Long> extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
    Owner save(Owner owner);
}
