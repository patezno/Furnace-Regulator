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
        int newTemperature = temperature.getTemperature() + 1;
        temperature.setTemperature(newTemperature);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        int newTemperature = temperature.getTemperature() - 1;
        temperature.setTemperature(newTemperature);
    }

    public void speak() {
    }
}
