package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeaure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeaure, Long> {
}
