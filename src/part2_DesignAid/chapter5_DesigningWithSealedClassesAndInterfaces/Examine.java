package part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces;

import part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.lights.TrafficLight;
import part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.lights.TrafficLightFactory;

public class Examine {
  public static void printInfo(Class<? extends TrafficLight> klass){
    System.out.println(klass.getSimpleName());
    System.out.println("Sealed?: " + klass.isSealed());

    System.out.println("Permitted subclasses:");
    var permittedSubClasses = klass.getPermittedSubclasses();
    if (permittedSubClasses != null){
      for (var permitted : klass.getPermittedSubclasses()){
        System.out.println(permitted);
      }
    }
  }

  static void main() {
    printInfo(TrafficLightFactory.createVertical().getClass());
    System.out.println("--------------");
    printInfo(TrafficLightFactory.createHorizontal().getClass());
    System.out.println("--------------");
    printInfo(TrafficLight.class);
  }
}
