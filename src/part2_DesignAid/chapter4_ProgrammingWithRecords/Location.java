package part2_DesignAid.chapter4_ProgrammingWithRecords;

public record Location(double longitude, double latitude) implements Json{
  @Override
  public String generateJson() {
    return
    """
    {
      "latitude":%g,
      "longitude":%g
    }
    """.formatted(latitude,longitude);
  }
}
