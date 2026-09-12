package part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.location;

import com.fasterxml.jackson.databind.ObjectMapper;
import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.space.Location;

import java.net.URI;
import java.util.Map;
import java.util.Scanner;

public class ISSLocation {
  public Location lookupLocation() {
    var ISS_NOW_URL = "http://api.open-notify.org/iss-now.json";

    try(var scanner =
                new Scanner(URI.create(ISS_NOW_URL).toURL().openStream())) {

      var responseText = scanner.nextLine();

      return extractLocationFrom(responseText);
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  @SuppressWarnings("unchecked")
  private Location extractLocationFrom(String text) {
    try {
      var jsonObjectMapper = new ObjectMapper();

      var data = jsonObjectMapper.readValue(text, Map.class);

      var location = (Map<String, String>) data.get("iss_position");

      return new Location(
              Double.parseDouble(location.get("latitude")),
              Double.parseDouble(location.get("longitude")));
    } catch(Exception ex) {
      throw new RuntimeException(ex);
    }
  }
}