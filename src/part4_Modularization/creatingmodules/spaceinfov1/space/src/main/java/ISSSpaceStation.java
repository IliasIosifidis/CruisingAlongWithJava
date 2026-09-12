package part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java;

import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.location.ISSLocation;
import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.iss.people.ISSPeople;
import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.space.SpaceStation;
import part4_Modularization.creatingmodules.spaceinfov1.space.src.main.java.space.SpaceStationInfo;

public class ISSSpaceStation implements SpaceStation{
  public SpaceStationInfo lookup() {
    return new SpaceStationInfo(
            new ISSLocation().lookupLocation(),
            new ISSPeople().lookupPeople());
  }
}
