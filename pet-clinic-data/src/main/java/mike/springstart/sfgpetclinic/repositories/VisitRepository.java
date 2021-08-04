package mike.springstart.sfgpetclinic.repositories;

import mike.springstart.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
