package Main;

import Hardware.AirConditioner;
import Hardware.Regulator;
import Hardware.RemoteCommandSensor;
import Interfaces.Heater;
import Interfaces.Thermometer;
import Other.Demon;
import Types.RoomTemperature;

public class App {

    public static void main(String[] args) {

        final double minTemp = 15.0;
        final double maxTemp = 21.0;

        RoomTemperature temperature = RoomTemperature.getRoomTemperature(15);
        Heater heater = new AirConditioner();
        Thermometer thermometer = new RemoteCommandSensor();

        Regulator regulator = new Regulator();

        System.out.println("Arrancando...");
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);

        Demon dante = new Demon();
        System.out.println("\nArrancando a Dante: ");
        regulator.regulate(thermometer, dante, minTemp, maxTemp, temperature);
        dante.speak();
    }
}
