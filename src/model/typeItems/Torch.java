package model.typeItems;

import model.Inventory;
import model.Item;

public class Torch extends Item {
    private boolean lit;

    public Torch() {
        super("Antorcha", "Una antorcha que puedes encender.", 2, true, true);
        this.lit = false;
    }

    @Override
    public void interact(Inventory inventory) {
        if (inventory.contains(this)) {
            if (!lit) {
                lit = true;
                System.out.println("Enciendes la antorcha. Ahora puedes ver mejor.");
            } else {
                System.out.println("La antorcha ya está encendida.");
            }
        } else {
            System.out.println("No tienes una Antorcha en tu inventario.");
        }
    }
}
