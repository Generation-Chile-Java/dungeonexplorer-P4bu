package model.rooms;

import interfaces.Room;
import model.Item;

public class EmptyRoom implements Room {
    private int id = 0;
    private Item itemRoom;

    public EmptyRoom(int id) {
        this.id = id;
    }

    public EmptyRoom(int id, Item itemRoom) {
        this.id = id;
        this.itemRoom = itemRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItemRoom() {
        return itemRoom;
    }

    public void setItemRoom(Item itemRoom) {
        this.itemRoom = itemRoom;
    }

    @Override
    public void enter() {
        System.out.println("Estas en una habitacion vacia.");
        System.out.println("No hay nada aqui.");
        //System.out.println(itemRoom.getNameObject());
    }
}
