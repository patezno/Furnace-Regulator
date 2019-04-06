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
        int newTemperature = temperature.getTemperature() + 1;
        temperature.setTemperature(newTemperature);
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        int newTemperature = temperature.getTemperature() - 1;
        temperature.setTemperature(newTemperature);
    }
}
