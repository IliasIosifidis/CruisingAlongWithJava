package part2_DesignAid.chapter4_ProgrammingWithRecords;

public class LocationVerbose {
  private final double latitude;
  private final double longitude;

  public LocationVerbose(double latitude, double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  static void main() {
    var alcatraz = new LocationVerbose(37.827, -122.423);
    System.out.println(alcatraz);
  }
}
