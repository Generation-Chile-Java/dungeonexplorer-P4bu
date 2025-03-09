package model.rooms;

import interfaces.Room;
import model.Enemy;
import model.Item;
import model.Player;

public class EnemyRoom implements Room {
    private int id = 2;
    private Item itemRoom;
    private Enemy enemy;

    public EnemyRoom(int id) {
        this.id = id;
    }

    public EnemyRoom(int id, Item itemRoom, Enemy enemy) {
        this.id = id;
        this.itemRoom = itemRoom;
        this.enemy = enemy;
    }

    public EnemyRoom(int id, Enemy enemy) {
        this.id = id;
        this.enemy = enemy;
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

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public void enter() {
        System.out.println("Un enemigo aparece y quiere atacarte!");
        //System.out.println("aca estoy (Prueba para objetos en las salas)");
        //System.out.println(itemRoom.getNameObject());
        System.out.println(enemy.getEnemyId());
        System.out.println(enemy.getDescriptionEnemy());
        enemy.attack(new Player());
    }
}
