package model.rooms;

import interfaces.Room;

public class EnemyRoom implements Room {
    private int id = 2;

    public EnemyRoom(int id) {
        this.id = id;
    }

    @Override
    public void enter() {
        System.out.println("Un enemigo aparece y quiere atacarte!");
    }
}
