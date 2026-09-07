package part2_DesignAid.chapter4_ProgrammingWithRecords;

public record LocationCompactConstructor(double latitude, double longitude) {
  public LocationCompactConstructor {
    if (latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180){
      throw new RuntimeException("this location is out of this world");
    }
    latitude = Math.round(latitude * 100.0)/ 100.0;
  }

}
