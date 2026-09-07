import part2_DesignAid.chapter4_ProgrammingWithRecords.Location;
import part2_DesignAid.chapter4_ProgrammingWithRecords.LocationCompactConstructor;

void main() throws InvocationTargetException, IllegalAccessException {
  var alcatraz = new Location(37.827, -122.423);
  var patra = new Location(584.784, 896.147);
  List<Location> locations = new ArrayList<>(List.of(alcatraz, patra));

//    alcatraz.latitude() = 0.0; // Fields are immutable
  System.out.println(alcatraz);
  locations.stream()
          .map(Location::latitude)
          .forEach(System.out::println);

  System.out.println("a class".getClass().isRecord());
  System.out.println(alcatraz.getClass().isRecord());

  for (RecordComponent component : alcatraz.getClass().getRecordComponents()) {
    var name = component.getName();
    var type = component.getType();
    Object value = component.getAccessor().invoke(alcatraz);
    System.out.println(type + " " + name + " " + " has value " + value);
  }

  // later
  var location1 = new Location(40.6892, -74.0445);
  var location2 = new Location(40.6892, -74.0445);
  var location3 = new Location(27.9881, 86.9250);

  System.out.println(location1.latitude());
  System.out.println(location1);
  System.out.println(location1.hashCode());
  System.out.println(location2.hashCode());
  System.out.println(location3.hashCode());
  System.out.println(location1.equals(location2));
  System.out.println(location1.equals(location3));

  // also later
  try{
    new LocationCompactConstructor(35.425, -222.356);
  } catch (RuntimeException e){
    System.out.println(e);
  }
  var alcaraz = new LocationCompactConstructor(37.827, -122.423);
  System.out.println(alcaraz);
}