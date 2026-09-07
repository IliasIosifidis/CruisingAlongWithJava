package part2_DesignAid.chapter4_ProgrammingWithRecords;

public record LocationValidation(double longitude, double latitude) {
  public LocationValidation(double longitude, double latitude) { //not preferable
    if (latitude < -90 || latitude > 90 || longitude < -180 || longitude > 180) {
      throw new RuntimeException("this location is out of this world");
    }
    this.latitude = Math.round(latitude * 100.0) / 100.0;
    this.longitude = longitude;
  }
}
