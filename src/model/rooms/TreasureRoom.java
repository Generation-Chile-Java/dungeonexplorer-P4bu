package model.rooms;

import interfaces.Room;

public class TreasureRoom implements Room {
    private int id = 1;

    public TreasureRoom(int id) {
        this.id = id;
    }

    @Override
    public void enter() {
        System.out.println("En la habitacion hay un tersoro!");
    }
}
