package part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.lights;

public sealed abstract class TrafficLight
        permits  HorizontalTrafficLight, part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.lights.RailroadLight, VerticalTrafficLight {
  public void turnRed(){};
  public void turnYellow(){};
  public void turnGreen(){};
}
final class VerticalTrafficLight extends TrafficLight{}
final class HorizontalTrafficLight extends TrafficLight{}

