package guru.springframework.repository;

import guru.springframework.entity.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
