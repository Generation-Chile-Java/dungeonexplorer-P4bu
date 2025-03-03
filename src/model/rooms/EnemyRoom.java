package model.rooms;

import interfaces.Room;

public class EnemyRoom implements Room {

    @Override
    public void enter() {
        System.out.println("Un enemigo aparece y quiere atacarte!");
    }
}
