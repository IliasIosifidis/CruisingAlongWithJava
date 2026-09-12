package part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.spaceclient;

import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.location.ISSLocation;
import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.people.ISSPeople;

import java.util.Scanner;

public class SpaceClient {
  static void main() {
    System.out.println("Please enter the space station you are interested in: ");

    try(var scanner = new Scanner(System.in)) {
      var spaceStationName = scanner.nextLine();

      if (!spaceStationName.equals("ISS")){
        System.out.println("SpaceStation with the name of " + spaceStationName + " not found");
      }else {
        var issLocation = new ISSLocation();
        var location = issLocation.lookupLocation();
        System.out.println("Current latitude and longitude of " +
                spaceStationName + " " +
                location.latitude() + " " +
                location.longitude());
        var issPeople = new ISSPeople();
        var occupants = issPeople.lookupPeople();
        System.out.println("Current occupants of " +
                spaceStationName + " " +
                String.join(", ", occupants));
      }
    }catch (Exception ex){
      System.out.println(ex.getMessage());
    }
  }
}
