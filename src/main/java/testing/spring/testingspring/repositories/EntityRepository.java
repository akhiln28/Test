package testing.spring.testingspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import testing.spring.testingspring.batchapi.TestEntity;

public interface EntityRepository extends JpaRepository<TestEntity, Long> {
}
