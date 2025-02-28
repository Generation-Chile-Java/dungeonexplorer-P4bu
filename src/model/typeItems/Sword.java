package model.typeItems;

import model.Inventory;
import model.Object;

public class Sword extends Object {
    static final int DAMAGE = 10;

    public Sword() {
        super("Espada", "Una espada afilada que hace daño.", 2, true, true);
    }

    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)){
            System.out.println("Usaste la espada. " + DAMAGE + " de daño.");
        } else {
            System.out.println("No tienes una espada en tu inventario.");
        }
    }
}
