package mike.springstart.sfgpetclinic.services;

import mike.springstart.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
