package testing.spring.testingspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testing.spring.testingspring.batchapi.SampleObject;
import testing.spring.testingspring.batchapi.TestEntity;
import testing.spring.testingspring.repositories.EntityRepository;

import java.util.List;

@RestController
public class TestController {
  @Autowired EntityRepository entityRepository;
  @GetMapping("/tests")
  List<TestEntity> getAllTests() {
    return entityRepository.findAll();
  }

  @GetMapping("/test/{id}")
  Object findTestEntity(@PathVariable("id") Long id) {
    TestEntity testEntity = entityRepository.findById(id).get();
    Object obj = testEntity.getObj();
    SampleObject sampleObject = (SampleObject) obj;
    return obj;
  }

  @PostMapping("/test")
  TestEntity addTestEntity(@RequestBody TestEntity testEntity) {
    return entityRepository.save(testEntity);
  }
}
