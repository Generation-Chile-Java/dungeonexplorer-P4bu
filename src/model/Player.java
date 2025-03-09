package model;

import model.typeItems.Sword;

public class Player {
    private String name;
    private Integer health = 100;
    private Inventory inventory;
    private Sword sword;

    public Player() {
    }

    public Player(String name, Integer health) {
        this.name = name;
        this.health = health;
    }

    public Player(String name, Integer health, Inventory inventory) {
        this.name = name;
        this.health = health;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    //TODO: Crear metodos para Player
    //TODO: Implementar GameObject

    public void attackPlayer(Enemy enemy) {
        enemy.setHealthEnemy((enemy.getHealthEnemy() - 5));
        System.out.println("la vida del enemigo es " + enemy.getHealthEnemy());
    }


}
