package model.rooms;

import interfaces.Room;

public class EmptyRoom implements Room {
    private int id = 0;

    public EmptyRoom(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }

    @Override
    public void enter() {
        System.out.println("Estas en una habitacion vacia.");
        System.out.println("No hay nada aqui.");
    }
}
