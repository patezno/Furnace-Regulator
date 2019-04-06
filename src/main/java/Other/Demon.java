package Other;

import Hardware.AirConditioner;
import Interfaces.Heater;
import Types.RoomTemperature;

public class Demon implements Heater {

    // Atributos

    private int badassery = 1000;

    // Constructor

    public Demon() {

    }

    // Metodos


    public int getBadassery() {
        return badassery;
    }

    @Override
    public void engage(RoomTemperature temperature) {
        temperature.incrementTemperature(this.showBadassery());
    }

    @Override
    public void disengage(RoomTemperature temperature) {
        Heater heater = new AirConditioner();
        this.stopBadassery(heater, temperature);
    }

    public void speak() {
        System.out.println("It can't be! The badassery of Dante's been slaughtered!");
        System.out.println("Will he defeat all demons now?");
        System.out.println("He better have some good jokes to throw around...");
    }

    // Metodos privados

    private void stopBadassery(Heater heater, RoomTemperature temperature) {
        temperature.incrementTemperature(-1000);
        heater.disengage(temperature);
    }

    private int showBadassery() {
        return this.getBadassery();
    }
}
