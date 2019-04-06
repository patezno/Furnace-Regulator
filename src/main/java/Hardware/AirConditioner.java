package Hardware;

import Interfaces.Heater;
import Types.RoomTemperature;

public class AirConditioner implements Heater {

    // Constructor

    public AirConditioner() {

    }

    // Metodos

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(1);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        temperature.incrementTemperature(-1);
    }
}
