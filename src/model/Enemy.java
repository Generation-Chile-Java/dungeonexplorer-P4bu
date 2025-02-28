package model;

public class Enemy {
    private String nameEnemy;
    private String descriptionEnemy;
    private Integer healthEnemy;

    public Enemy() {
    }

    public Enemy(String nameEnemy, String descriptionEnemy, Integer healthEnemy) {
        this.nameEnemy = nameEnemy;
        this.descriptionEnemy = descriptionEnemy;
        this.healthEnemy = healthEnemy;
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

    //TODO: Crear metodos Enemigo
    //TODO: Implementar GameObject

}
