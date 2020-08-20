package guru.springframework.repository;

import guru.springframework.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
