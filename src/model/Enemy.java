package model;

import java.util.Random;

public abstract class Enemy {
    private static final Random random = new Random();

    private String nameEnemy;
    private String descriptionEnemy;
    private Integer healthEnemy = 100;
    private int enemyId;

    public Enemy() {
    }

    public Enemy(String nameEnemy, String descriptionEnemy, Integer healthEnemy) {
        this.nameEnemy = nameEnemy;
        this.descriptionEnemy = descriptionEnemy;
        this.healthEnemy = healthEnemy;
    }

    public Enemy(String nameEnemy, String descriptionEnemy, Integer healthEnemy, int enemyId) {
        this.nameEnemy = nameEnemy;
        this.descriptionEnemy = descriptionEnemy;
        this.healthEnemy = healthEnemy;
        this.enemyId = enemyId;
    }

    public String getNameEnemy() {
        return nameEnemy;
    }

    public void setNameEnemy(String nameEnemy) {
        this.nameEnemy = nameEnemy;
    }

    public String getDescriptionEnemy() {
        return descriptionEnemy;
    }

    public void setDescriptionEnemy(String descriptionEnemy) {
        this.descriptionEnemy = descriptionEnemy;
    }

    public Integer getHealthEnemy() {
        return healthEnemy;
    }

    public void setHealthEnemy(Integer healthEnemy) {
        this.healthEnemy = healthEnemy;
    }

    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
    }

    //TODO: Crear metodos Enemigo
    public abstract void attack(Player player);

    public void takeDamage(int damage) {
        this.healthEnemy -= damage;
        System.out.println(nameEnemy + " ha recibido " + damage + " de daño. Vida restante: " + healthEnemy);
    }

}
