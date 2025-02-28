package model.typeItems;

import model.Object;

public class Potion extends Object {
    static final int heal_Health = 20;

    public Potion() {
        super("Poción sanadora", "Una poción que cura 20 puntos de vida." , 1, true, true);
    }


}
