package part2_DesignAid.chapter5_DesigningWithSealedClassesAndInterfaces.power;

public sealed interface PowerSource
  permits ElectricGridSource, GreenPower, ExperimentalPower{
  void drawEnergy();
}

final class ElectricGridSource implements PowerSource{
  @Override
  public void drawEnergy() {}
}

sealed interface GreenPower extends PowerSource
  permits SolarPower, WindPower{}

final class SolarPower implements GreenPower{
  @Override
  public void drawEnergy() {}
}

final class WindPower implements GreenPower{
  @Override
  public void drawEnergy() {}
}

non-sealed interface ExperimentalPower extends PowerSource{}

class LaughterPower implements ExperimentalPower{
  @Override
  public void drawEnergy() {}
}