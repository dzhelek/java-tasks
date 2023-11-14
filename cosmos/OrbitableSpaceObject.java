package cosmos;

import java.util.List;

public abstract class OrbitableSpaceObject extends SpaceObject{
    List<SpaceObject> orbiters;
    abstract void addOrbiter(SpaceObject orbiter);
    abstract List<SpaceObject> getOrbiters();
}
