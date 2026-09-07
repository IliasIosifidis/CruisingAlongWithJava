package part2_DesignAid.chapter4_ProgrammingWithRecords;

public record LocationNonCanonical(double longitude, double latitude) {
  public LocationNonCanonical {
    if (latitude < -90 || latitude > 90 ||
            longitude < -180 || longitude > 180) {
      throw new RuntimeException("The location is out of this world");
    }
    latitude = Math.round(latitude * 100.0) / 100.0;
  }
  public LocationNonCanonical(String position){
    this(Double.parseDouble(position.split(":")[0]),
            Double.parseDouble(position.split(":")[1]));
  }
}
