package testing.spring.testingspring.batchapi;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "entity")
@Data
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
public class TestEntity<T> {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  private String name;
  private String description;
  @Type(type = "jsonb")
  @Column(columnDefinition = "jsonb")
  private Person person;

  @Type(type = "jsonb")
  @Column(columnDefinition = "jsonb")
  private T obj;

  @Type(type = "jsonb")
  @Column(columnDefinition = "jsonb")
  private Map<String, String> map;
}
