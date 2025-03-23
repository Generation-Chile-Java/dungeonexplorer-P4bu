package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addObjectInventory(Item item) {
        if (item.getEquippedObject()) {
            items.add(item);
            System.out.println("Felicidades! Equipaste " + item.getNameObject() + " en tu mochila.");
        }
    }

    public void removeObjectInventory(Item item) {
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item obj = iterator.next();
            if (obj.equals(item)) {
                iterator.remove();
                System.out.println("Dejaste " + item.getNameObject() + " de tu mochila.");
                return;
            }
        }
        System.out.println("No tienes " + item.getNameObject() + " en tu mochila.");
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }

    public void showDetail() {
        if (items.isEmpty()) {
            System.out.println("Tu mochila está vacía.");
        } else {
            System.out.println("Contenido de la mochila:");
            for (Item item : items) {
                System.out.println("* " + item.getNameObject() + " => " + item.getDescriptionObject());
            }
        }
    }

    // Método para obtener todos los objetos en el inventario
    public ArrayList<Item> getItems() {
        return items;
    }
}
