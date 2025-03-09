package model.typeItems;

import model.Inventory;
import model.Item;

public class Crown extends Item {

    public Crown() {
        super("Corona","Hermosa corona de oro con diamantes. Te puede llevar a la victoria",1, false, true);
    }

    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)) {
            System.out.println("Saliste de las salas y mostraste la corona y ahora ganas el juego.");
        } else {
            System.out.println("No puedes ganar si no tienes la corono en tu mochila.");
        }
    }
}
