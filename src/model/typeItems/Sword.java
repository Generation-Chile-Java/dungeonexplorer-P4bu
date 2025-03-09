package model.typeItems;

import model.Inventory;
import model.Item;

public class Sword extends Item {
    private int damage = 10;

    public int getDamage() {

        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Sword() {
        super("Espada", "Una espada afilada que hace daño.", 2, true, true);
    }

    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)){
            System.out.println("Usaste la espada. " + damage + " de daño.");
        } else {
            System.out.println("No tienes una espada en tu inventario.");
        }
    }
}
