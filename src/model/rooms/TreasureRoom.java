package model.rooms;

import interfaces.Room;
import model.Item;

public class TreasureRoom implements Room {
    private int id = 1;
    private Item itemRoom;

    public TreasureRoom(int id) {
        this.id = id;
    }

    public TreasureRoom(int id, Item itemRoom) {
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
        System.out.println("En la habitacion hay un tersoro!");
        System.out.println("aca estoy");
        System.out.println(itemRoom.getNameObject());
    }
}
