package part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.people;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class ISSPeople {
  public List<String> lookupPeople() {
    var ASTROS_URL = "http://api.open-notify.org/astros.json";
    try(var scanner =
                new Scanner(URI.create(ASTROS_URL).toURL().openStream())) {
      var responseText = scanner.nextLine();
      return extractNamesFrom(responseText);
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  @SuppressWarnings("unchecked")
  private List<String> extractNamesFrom(String text) {
    try {
      var jsonObjectMapper = new ObjectMapper();
      var data = jsonObjectMapper.readValue(text, Map.class);
      var people = (List<Map<String, String>>) data.get("people");
      return people.stream()
              .filter(craftAndPerson -> craftAndPerson.get("craft").equals("ISS"))
              .map(craftAndPerson -> craftAndPerson.get("name"))
              .collect(toList());
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}