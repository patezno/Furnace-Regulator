package Interfaces;

import Types.RoomTemperature;

public interface Heater {

    void engage(RoomTemperature temperature);

    void disengage(RoomTemperature temperature);
}
