package model.rooms;

import interfaces.Room;

public class TreasureRoom implements Room {


    @Override
    public void enter() {
        System.out.println("En la habitacion hay un tersoro!");
    }
}
