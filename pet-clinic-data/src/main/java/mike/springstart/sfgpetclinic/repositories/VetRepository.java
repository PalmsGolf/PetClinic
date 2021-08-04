package mike.springstart.sfgpetclinic.repositories;

import mike.springstart.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
