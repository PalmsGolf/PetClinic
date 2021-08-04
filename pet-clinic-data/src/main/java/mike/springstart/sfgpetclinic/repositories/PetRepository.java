package mike.springstart.sfgpetclinic.repositories;

import mike.springstart.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Long> {
}