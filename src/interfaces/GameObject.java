package interfaces;

import model.Inventory;
import model.Object;

public interface GameObject {
    void interact(Inventory inventory);
    void showDetail();
}
