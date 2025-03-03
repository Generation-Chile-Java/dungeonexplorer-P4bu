package model.rooms;

import interfaces.Room;

public class EmptyRoom implements Room {


    @Override
    public void enter() {
        System.out.println("Estas en una habitacion vacia.");
        System.out.println("No hay nada aqui.");
    }
}
