package sda.jackson;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class JacksonTests {
  @Test
  public void shouldCreateJSONCorrectly() throws IOException {
      Person person = new Person();
      person.setName("Jan");
      person.setLastName("Kowalski");
      person.setAge(50);

      PersonAddress address = new PersonAddress();
      address.setCity("Poznań");
      address.setPostalCode("11-111");
      address.setStreet("Dąbrowskiego");

      person.setAddress(address);

      ObjectMapper objectMapper = new ObjectMapper();
      String json = objectMapper.writeValueAsString(person);
      System.out.println(json);
  }

  @Test
  public void shouldParseJSONCorrectly() throws IOException {
    String json = "{\"name\":\"Tomasz\",\"lastName\":\"Nowak\",\"age\":40,\"address\":{\"street\":\"Św.Marcin\",\"postalCode\":\"11-111\",\"city\":\"Poznań\"}}";

    ObjectMapper objectMapper = new ObjectMapper();

    Person person = objectMapper.readValue(json, Person.class);
  }
}
