package model;

import interfaces.GameObject;

public class Item implements GameObject {
    private String nameObject;
    private String descriptionObject;
    private int quantityUse;
    private Boolean isUseObject;
    private Boolean isEquippedObject;

    public Item() {
    }

    public Item(String nameObject, String descriptionObject, int quantityUse, Boolean isUseObject, Boolean isEquippedObject) {
        this.nameObject = nameObject;
        this.descriptionObject = descriptionObject;
        this.quantityUse = quantityUse;
        this.isUseObject = isUseObject;
        this.isEquippedObject = isEquippedObject;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public String getDescriptionObject() {
        return descriptionObject;
    }

    public void setDescriptionObject(String descriptionObject) {
        this.descriptionObject = descriptionObject;
    }

    public Boolean getUseObject() {
        return isUseObject;
    }

    public void setUseObject(Boolean useObject) {
        isUseObject = useObject;
    }

    public Boolean getEquippedObject() {
        return isEquippedObject;
    }

    public void setEquippedObject(Boolean equippedObject) {
        isEquippedObject = equippedObject;
    }

    public int getQuantityUse() {
        return quantityUse;
    }

    public void setQuantityUse(int quantityUse) {
        this.quantityUse = quantityUse;
    }

    @Override
    public void interact(Inventory inventory) {
        if(inventory.contains(this)){
            if(quantityUse == 1){
                System.out.println("Usando " + nameObject + "....");
                System.out.println("El item solo " + nameObject + " solo se usa una vez. Sera eliminado de tu mochila");
                inventory.removeObjectInventory(this);
            } else {
                System.out.println("Usando " + nameObject + "....");
            }
        } else {
            System.out.println("No tienes " + getNameObject() + "en la mochila!");
        }
    }

    @Override
    public void showDetail() {
        System.out.println("Nombre: " + nameObject);
        System.out.println("Descripción: " + descriptionObject);
    }

    //TODO: Crear metodos para objetos Usar y Equipar
    //TODO: Implementar GameObject

}
