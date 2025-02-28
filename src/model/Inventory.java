package model;

import interfaces.GameObject;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
    private ArrayList<Object> objects;

    public Inventory(){
        objects = new ArrayList<>();
    }

    public void addObjectInventory(Object object) {
        if(object.getEquippedObject()){
            objects.add(object);
            System.out.println("Felicidades!. Guardaste " + object.getNameObject() + " a tu mochila.");
        }
    }

    public void removeObjectInventory(Object object) {
        Iterator<Object> iterator = objects.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            if (obj.equals(object)) {
                iterator.remove();
                System.out.println("Queee!. Dejaste " + object.getNameObject() + " de tu mochila.");
                return;
            }
        }
        System.out.println("No tienes " + object.getNameObject() + " en tu mochila.");
    }

    // Para ser el uso en la clase objecto
    public boolean contains(Object object) {
        return objects.contains(object);
    }

    public void showDetail() {
        if(objects.isEmpty()){
            System.out.println("Tu mochila esta vacia");
        } else {
            System.out.println("Contenido Mochila");
            for(Object object : objects){
                System.out.println("*" + object.getNameObject() + "=> " + object.getDescriptionObject());
            }
        }

    }
}
