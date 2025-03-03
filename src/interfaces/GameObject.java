package interfaces;

import model.Inventory;

public interface GameObject {
    void interact(Inventory inventory);
    void showDetail();
}
