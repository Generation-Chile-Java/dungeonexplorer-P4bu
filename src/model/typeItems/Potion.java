package model.typeItems;

import model.Inventory;
import model.Item;

public class Potion extends Item {
    static final int HEAL_HEALTH = 20;

    public Potion() {
        super("Pocion", "Una poción magica que cura 20 puntos de vida." , 1, true, true);
    }

    //TODO: Completar metodo interactuar


    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)){
            System.out.println("Usaste la pocion. Curaste " + HEAL_HEALTH + " de vida.");
        } else {
            System.out.println("No tienes una pocion en tu inventario.");
        }
    }
}
