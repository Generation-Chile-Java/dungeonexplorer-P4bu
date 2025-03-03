package model;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addObjectInventory(Item item) {
        if(item.getEquippedObject()){
            items.add(item);
            System.out.println("Felicidades!. Equipaste " + item.getNameObject() + " en tu mochila.");
        }
    }

    public void removeObjectInventory(Item item) {
        Iterator<Item> iterator = items.iterator();
        while(iterator.hasNext()){
            Item obj = iterator.next();
            if (obj.equals(item)) {
                iterator.remove();
                System.out.println("Queee!. Dejaste " + item.getNameObject() + " de tu mochila.");
                return;
            }
        }
        System.out.println("No tienes " + item.getNameObject() + " en tu mochila.");
    }

    // Para ser el uso en la clase objecto
    public boolean contains(Item item) {
        return items.contains(item);
    }

    public void showDetail() {
        if(items.isEmpty()){
            System.out.println("Tu mochila esta vacia");
        } else {
            System.out.println("Contenido Mochila");
            for(Item item : items){
                System.out.println("* " + item.getNameObject() + "=> " + item.getDescriptionObject());
            }
        }

    }
}
