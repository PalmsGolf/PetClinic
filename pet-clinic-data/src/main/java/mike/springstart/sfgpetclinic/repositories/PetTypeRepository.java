package mike.springstart.sfgpetclinic.repositories;

import mike.springstart.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
