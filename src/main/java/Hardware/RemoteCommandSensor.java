package Hardware;

import Interfaces.Thermometer;
import Types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

    // Constructor

    public RemoteCommandSensor() {

    }

    // Metodos

    @Override
    public int read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}
