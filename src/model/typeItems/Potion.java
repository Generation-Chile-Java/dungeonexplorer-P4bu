package model.typeItems;

import model.Inventory;
import model.Object;

public class Potion extends Object {
    static final int heal_Health = 20;

    public Potion() {
        super("Pocion", "Una poción que cura 20 puntos de vida." , 1, true, true);
    }

    //TODO: Completar metodo interactuar


    @Override
    public void interact(Inventory inventory) {
        super.interact(inventory);
    }
}
