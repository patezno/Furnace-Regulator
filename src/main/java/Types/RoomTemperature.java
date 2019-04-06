package Types;

public class RoomTemperature {

    // Atributos

    private int temperature = 0;
    private static RoomTemperature checkObject = null;

    // Constructores

    private RoomTemperature() {

    }

    private RoomTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Getter

    public int getTemperature() {
        return temperature;
    }

    // Metodos

    public static RoomTemperature getRoomTemperature(int temperature) {

        if (checkObject == null) {
            checkObject = new RoomTemperature(temperature);
        }
        return checkObject;
    }

    public void incrementTemperature(int temperature) {
        this.temperature += temperature;
    }
}
