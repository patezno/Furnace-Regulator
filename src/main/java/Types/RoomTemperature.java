package Types;

public class RoomTemperature {

    // Atributos

    private int temperature = 0;

    // Constructores

    public RoomTemperature() {

    }

    public RoomTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Getter

    public int getTemperature() {
        return temperature;
    }

    // Metodos

    public void incrementTemperature(int temperature) {
        this.temperature += temperature;
    }
}
