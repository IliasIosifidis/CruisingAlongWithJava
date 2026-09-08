package part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.lights;

public class TrafficLightFactory {

  public static TrafficLight createVertical(){
    return new VerticalTrafficLight();
  }

  public static TrafficLight createHorizontal(){
    return new HorizontalTrafficLight();
  }
}
