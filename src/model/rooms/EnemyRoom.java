package model.rooms;

import interfaces.Room;
import model.Item;

public class EnemyRoom implements Room {
    private int id = 2;
    private Item itemRoom;

    public EnemyRoom(int id) {
        this.id = id;
    }

    public EnemyRoom(int id, Item itemRoom) {
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
        System.out.println("Un enemigo aparece y quiere atacarte!");
        System.out.println("aca estoy (Prueba para objetos en las salas)");
        System.out.println(itemRoom.getNameObject());
    }
}
