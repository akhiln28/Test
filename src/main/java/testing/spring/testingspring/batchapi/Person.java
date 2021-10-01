package testing.spring.testingspring.batchapi;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import org.hibernate.annotations.TypeDef;
import org.hibernate.usertype.UserType;

import java.io.Serializable;

@Data
@TypeDef(name = "jsonb", typeClass = MyJsonType.class)
public class Person implements Serializable {
  private String name;
  private int age;
  private int height;
}
