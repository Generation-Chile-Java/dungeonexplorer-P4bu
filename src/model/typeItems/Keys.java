package model.typeItems;

import model.Inventory;
import model.Item;

public class Keys extends Item {
    public Keys() {
        super("Llave","Llave maestra, con ella podras abrir cualquier tipo de cerraduras. Pero solo una vez!", 1,true,true);
    }

    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)){
            System.out.println("Usaste la llave maestra para abrir la cerradura. ");
            inventory.removeObjectInventory(this);
        } else {
            System.out.println("No tienes un llave maestra para abrir las cerraduras. Debes buscar una");
        }
    }
}
