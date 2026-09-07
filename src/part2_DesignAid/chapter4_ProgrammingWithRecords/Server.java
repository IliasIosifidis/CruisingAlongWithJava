package part2_DesignAid.chapter4_ProgrammingWithRecords;

public record Server(String id, StringBuilder name) { // Bad idea
  static void main() {
    var server1 = new Server("S1", new StringBuilder("app1"));
    System.out.println(server1);
    // cant assign server1.id
    // cat assign server1.name
    server1.name().append("--production");
    System.out.println(server1);
  }
}
