package Other;

import Interfaces.Heater;
import Types.RoomTemperature;

public class Demon implements Heater {

    // Constructor

    public Demon() {

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

    public void speak() {
    }
}
